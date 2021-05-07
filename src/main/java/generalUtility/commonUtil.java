package generalUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class commonUtil {
	public static WebDriver driver;
	
	//initialisation
	
	public static void initialisation(){
System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32_77ver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
	
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
	//for sendkeys
	
	public static void explicitlyWaitSendkeys(WebDriver driver,WebElement elememt,int timeout,String value){
		
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		
		wait.until(ExpectedConditions.visibilityOf(elememt));	
		
		elememt.sendKeys(value);
		
	}
	
public static void explicitlyWaitClick(WebDriver driver,WebElement elememt,int timeout){
		
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		
		wait.until(ExpectedConditions.elementToBeClickable(elememt));	
		
		elememt.click();
		
	}
	
	//take screenshot
public static void TakeSnapShot(String testMethodName) throws IOException{

	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcFile,new File("D:\\Softwares\\JAVA\\NOTES\\com.GeneralPracticeDeepa\\screenshots\\"+testMethodName+"_"+".jpg"));
}
	
//handel calender
public static void handleClender(WebDriver driver, WebElement element ,String dateVal){
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
	
	
}
	
//code for fetching data
	
public static void fetchdata() throws IOException{
	
File f = new File("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");

FileInputStream excel = new FileInputStream(f);

XSSFWorkbook exl = new XSSFWorkbook(excel);

Sheet exl1 = exl.getSheet("Sheet1");

for (int i = 0; i <exl1.getLastRowNum(); i++) {

	for (int j =0; j <exl1.getRow(0).getLastCellNum(); j++) {
		
		String obj=exl1.getRow(i+1).getCell(j).toString();
		
		System.out.println(obj);
}

}

}
public static void main(String[] args) throws IOException {
	fetchdata();
}
	public static void m1(){
	}






}
