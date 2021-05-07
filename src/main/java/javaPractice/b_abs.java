package javaPractice;

import java.io.EOFException;
/*import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;*/

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public strictfp class b_abs extends a_abs{
	
	public void aju(){
		
		System.out.println("i m aju");
		
		
	}

	
	public void shri() {
		System.out.println("i m shri");
		
	}

	
	public void deepa() {
		System.out.println("i m deepa");
		
	}
	public void chiu() throws EOFException,InterruptedException{
		System.out.println("a");
	}
	
	public static void main(String[] args) throws EOFException, InterruptedException {
		/*b_abs a=new b_abs();
		a.aju();
		a.chiu();
		a.shri();
		a.deepa();*/
//		WebDriver dri = new ChromeDriver();
		
		
//		ChromeDriver dri2 = new ChromeDriver();
		
		
		arraylistPrac ap= new arraylistPrac();
		ap.m1();
		
		listPract lp= new arraylistPrac();
		lp.m1();
		
		listPract lp2= new linklistPrac();
		lp2.m1();
		
	}

}
