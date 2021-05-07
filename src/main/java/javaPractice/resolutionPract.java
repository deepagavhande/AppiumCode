package javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resolutionPract {
	
	public void m1(animalResolution a){
		
		System.out.println(" animal version");
		
	}
	
public void m1(monkeyresolution m){
		
		System.out.println(" monkey version");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//WebDriver driver new ChromeDriver();
		
		resolutionPract rp=new resolutionPract();
		 
		 rp.m1(new animalResolution());
		 
		 rp.m1(new monkeyresolution());
		 
		 animalResolution am=new monkeyresolution();
		 
		 rp.m1(am);
	
		
		 
		
	}

}
