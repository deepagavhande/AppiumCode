package seleniumBasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import generalUtility.commonUtil;

public class dynamicTablePract extends commonUtil {
	
	public static void main(String[] args) {
		
		initialisation();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://www.crmpro.com");
		
		driver.findElement(By.name("username")).sendKeys("satish147");
		
		
		driver.findElement(By.name("password")).sendKeys("147612");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[@href='https://www.crmpro.com/system/index.cfm?action=contact']")).click();

		
		driver.findElement(By.xpath("//a[contains(text(),'Priya Vinchu')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
	}

}
