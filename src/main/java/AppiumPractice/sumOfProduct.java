package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class sumOfProduct {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API27");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability("unicodekeyboared", true);
		cap.setCapability("resetkeyboared", true);
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.APP,"D:\\Softwares\\JAVA\\NOTES\\com.GeneralPracticeDeepa\\src\\General-Store.apk");
		AndroidDriver <AndroidElement> ad=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //ad.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepa");
      		ad.findElement(By.xpath("*//*[@text='Enter name here']")).sendKeys("hello");;
      		ad.findElement(By.xpath("*//*[@text='Female']")).click();
      		ad.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
      		//scroll code
      		// capturing all the list item
      		AndroidElement list=(AndroidElement) ad.findElement(By.id("android:id/text1"));
      		//Scrolling till we get element
      		ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
      		/*MobileElement listitem=(MobileElement)ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"Argentina\"));"));
      		System.out.println(listitem.getLocation());
      		listitem.click();*/
      		
      		ad.findElement(By.xpath("*//*[@text='Argentina']")).click();
      		ad.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
      		ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
    		
      		ad.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
    		ad.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
    				
    				Thread.sleep(4000);
    				/*TouchActions action=new TouchActions(ad);
    	    		action.scroll(10, 100);
    	    		action.perform();		*/
    		ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$165.0\"))"));
    		ad.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
    		
    	
            //try{
    		String amount1=ad.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
    		//$120.0
    		amount1=amount1.substring(1);
    		double amount1value=Double.parseDouble(amount1);
    		//120.0
    		String amount2=ad.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
    		amount2=amount2.substring(1);
    		double amount2value= Double.parseDouble(amount2);
    		double sumOfvalue=amount1value+amount2value;
    		System.out.println(sumOfvalue);
    		String total=ad.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
    		total=total.substring(1);
    		double totalValue=Double.parseDouble(total);
    		//Assert.assertEquals(sumOfvalue, totalValue);
    		Assert.assertEquals(sumOfvalue, totalValue,0.001);
    		
    	/*	
            }
            catch(Exception ex){
            	ex.printStackTrace();
            	//ad.navigate().refresh();
            	WebDriverWait wait=new WebDriverWait(ad, 10);
            	wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf((AndroidElement) ad.findElements(By.id("com.androidsample.generalstore:id/productPrice")))));
            	String amount1=ad.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
        		//$120.0
        		amount1=amount1.substring(1);
        		double amount1value=Double.parseDouble(amount1);
        		//120.0
        		String amount2=ad.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
        		amount2=amount2.substring(1);
        		double amount2value= Double.parseDouble(amount2);
        		double sumOfvalue=amount1value+amount2value;
        		System.out.println(sumOfvalue);
        		String total=ad.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        		total=total.substring(1);
        		double totalValue=Double.parseDouble(total);
        		Assert.assertEquals("280.0", totalValue);
        		
            }*/
    		
    		
	}

}
