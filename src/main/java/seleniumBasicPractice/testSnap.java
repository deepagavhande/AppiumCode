package seleniumBasicPractice;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import generalUtility.commonUtil;

public class testSnap extends commonUtil {
	
public static void main(String[] args) throws IOException {
	//testSnap.m1();	
	
	//testSnap.m2();
	
	initialisation();
	
	driver.get("http://demo.guru99.com/test/upload/");
	
	//Pattern pt= new Pattern("D:\\pdf\\plus.PNG");
	

	driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\pdf\\auto.png");
	
	driver.findElement(By.id("terms")).click();
	
	/*Screen sc=new Screen(); 
	sc.click("D:\\pdf\\plus.PNG");
*/	//driver.findElement(By.id("")).click();
	
	//Alert alert= driver.switchTo().alert();
	//alert.dismiss();
	
	driver.findElement(By.id("submitbutton")).click();
}

/*public static void m1() throws IOException{
	
	initialisation();
	
	driver.get("https://github.com/");
	
	TakeSnapShot(testSnap.class.getName());
}

	



public static void m2() throws IOException{
	//initialisation();
	
	driver.navigate().to("https://www.facebook.com/");

	TakeSnapShot(testSnap.class.getName());
}
		*/
		

}
