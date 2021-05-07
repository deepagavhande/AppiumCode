package seleniumBasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frmaesPractice {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().window().maximize();
		List<WebElement> allframe=driver.findElements(By.tagName("iframe"));
		int framesno=allframe.size();
		System.out.println(framesno);
		for(WebElement ele:allframe){
			System.out.println(ele.getAttribute("id"));
		}
		//WebElement webid=driver.findElement(By.id("google_osd_static_frame_3764844226320"));
		driver.switchTo().frame(0);
		
	}

}
