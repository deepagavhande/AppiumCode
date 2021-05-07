package seleniumBasicPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32_77ver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
	
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String mainwindow=driver.getWindowHandle();
		
		System.out.println(mainwindow);
		
		
		
		Set<String> allWindowHandel=driver.getWindowHandles();
		
		System.out.println(allWindowHandel);
		
		Iterator<String> i1=allWindowHandel.iterator();
	    
		while(i1.hasNext()){
			
			String childwindow=i1.next();
		
			if (mainwindow.equalsIgnoreCase(childwindow)){
				
				driver.switchTo().window(childwindow);
				
				WebElement element= driver.findElement(By.name("emailid"));
				
				
			System.out.println(driver.getTitle());
			
			WebDriverWait wait= new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOf(element));	
			
			element.sendKeys("deepagavhande21@gmai.com");
			
			}
		}
	}

}
