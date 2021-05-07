package ApiTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dpTest extends dpUtil{
	
	static WebDriver driver;
	
	@BeforeMethod
	public void SetUP(){
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32_77ver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Form");		
	}
	
	@DataProvider
	public Object[][] getexceldata() throws IOException{
		
		

		Object [][] returnArray= dpUtil.getUtildata();	
		return returnArray;	
	}
	
	@Test(dataProvider = "getexceldata")
	public void Datapro(String fname, String Lname, String uname) {
	    driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(Lname);
		driver.findElement(By.id("username")).sendKeys(uname);
		//driver.findElement(By.id("email")).sendKeys(EMail);
	}

/*	@AfterMethod
	
	public void teardown(){
		driver.quit();
	}*/
	
	}
