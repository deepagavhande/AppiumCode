package testNgPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestListener;
import generalUtility.commonUtil;
import junit.framework.Assert;

@Listeners(customListner.class)

public class screenshotTest extends commonUtil {
		
	@BeforeMethod
	public void setup(){
		
		initialisation();
		driver.get("https://www.google.com/");
	}
	/*@AfterMethod
	 public void teardown(){
		closeBrowser();
	}
 */
	@Test
  public void ScreenshotTest() {
		
		Assert.assertEquals(true, false);

  }
	@Test
public void ScreenshotTest1() {
		
		Assert.assertEquals(true, false);

  }
	@Test
public void ScreenshotTest2() {
	
	Assert.assertEquals(true, false);

}
	
}
