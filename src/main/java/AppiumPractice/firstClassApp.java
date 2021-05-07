package AppiumPractice;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;

public class firstClassApp {
public static AndroidDriver<AndroidElement> ad;
	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//File f=new File("src");
		//File fs=new File(f,"ApiDemos-debug.apk");
	@BeforeTest
	public static void initialisation() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API27");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability("unicodekeyboared", true);
		cap.setCapability("resetkeyboared", true);
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.APP,"D:\\Softwares\\JAVA\\NOTES\\com.GeneralPracticeDeepa\\src\\General-Store.apk");
		ad=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("lauching of app");
		
	}
	@Test(priority=1)
	public static void loginToApp()throws MalformedURLException, InterruptedException{

		//ad.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepa");
		//AndroidDriver ad = initialisation();
		ad.findElement(By.xpath("*//*[@text='Enter name here']")).sendKeys("hello");
		ad.findElement(By.xpath("*//*[@text='Female']")).click();
		ad.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//scroll code
		// capturing all the list item
		AndroidElement list=(AndroidElement) ad.findElement(By.id("android:id/text1"));
		//Scrolling till we get element
		/*MobileElement listitem=(MobileElement)ad.findElement(MobileBy.AndroidUIAutomator("new uiscrollable(new uiSelector()).ScrollIntoView("+"new uiselector().description(\"Argentina\"));"));
		System.out.println(listitem.getLocation());
		listitem.click();
		*/
		ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		ad.findElement(By.xpath("*//*[@text='Argentina']")).click();
	}
		
		//Shop the item in the app by scrolling to specific product and add to cart
		@Test(priority=2)
		public static void addToCart()throws MalformedURLException, InterruptedException{
			
			 //loginToApp();
			ad.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    		ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		//get the list of product
				
    		int count=ad.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
    		for(int i=0;i<count;i++){
    		String text=((RemoteWebElement) ad.findElements(By.id("com.androidsample.generalstore:id/productName")).
    		get(i)).getText();
    		
    		if(text.equalsIgnoreCase("Jordan 6 Rings")){
    			
    		((RemoteWebElement) ad.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i)).click();
    		
    		break;
    		}
    		ad.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
    		}
    		
		}
		//validate if the item selected in the page 2 are matching with item displayed in check out page.
		@Test(priority=3)
		public static void matchingItem()throws MalformedURLException, InterruptedException{
			
			 //loginToApp();
			String LastPageText= ad.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
    		System.out.println(LastPageText);
    		Assert.assertEquals("Jordan 6 Rings",LastPageText);
    		
		}
		//validate the total amount displayed in checkout page matches with sum of product amounts selected for shopping
		@Test(priority=4)
		public static void sumOfProduct() throws MalformedURLException, InterruptedException{
			//ad.navigate().back();
			initialisation();
			loginToApp();
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
    		
		}
	//}
}
