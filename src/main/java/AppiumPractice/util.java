package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class util {
	public static AndroidDriver ad;
	//@BeforeTest
	public static AndroidDriver initialisation() throws MalformedURLException, InterruptedException{
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
        System.out.println("lauching of app");
        return ad;
	}

}
