package seleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class toolTipEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\JAVA\\drivers\\chromedriver_win32_77ver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("http://demoqa.com/tooltip");
		
		WebElement textBox=driver.findElement(By.id("age"));
		
		String tooltip=textBox.getAttribute("title");
		
		System.out.println(tooltip);
		
		if(tooltip.equalsIgnoreCase("we ask for your age only for statistical purposes.")){
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");	
		}*/
		
		//using action class
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		
		Actions actions= new Actions(driver);
		
		WebElement ele=driver.findElement(By.id("tooltipDemo"));
		
		actions.moveToElement(ele).perform();
		
	WebElement tooltip=	driver.findElement(By.cssSelector(".tooltiptext"));
		
	String getToolTip=tooltip.getText();
		
	System.out.println(getToolTip);
	}
}
