package seleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generalUtility.commonUtil;

public class handelCalender extends commonUtil {
	public static void main(String[] args) {
	
		initialisation();
		
		driver.get("http://spicejet.com/");
		
	WebElement ele=	driver.findElement(By.id(""));
		
		String dateVal="30-12-2019";
		
		handleClender(driver, ele, dateVal);
	}

}
