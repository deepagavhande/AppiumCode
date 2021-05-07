package seleniumBasicPractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class waitPract {
	
	static WebDriver driver;
	 
	public static void main(String[] args) {	
	
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32_77ver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://demo.guru99.com/popup.php");

	//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
	

	
	Wait<WebDriver> wt=new FluentWait<WebDriver>(driver)
			.withTimeout(20, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	
 
	WebElement clickLink= wt.until(new Function<WebDriver,WebElement>(){
		
		public WebElement apply(WebDriver driver){
			return driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
			}
		
	});
	clickLink.click();
	}		
}
