package ApiPractice;

import java.util.HashMap;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {

		/*
		 * To compare two integers
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int num1; int num2; System.out.println("Enter 1 no \n"); num1 =
		 * sc.nextInt(); System.out.println("Enter 2 no \n"); num2 =
		 * sc.nextInt();
		 * 
		 * if(num1==num2){ System.out.println("Both no's sre equal"); } else
		 * if(num1>num2){
		 * System.out.println("1st no is greater than 2nd no \n"); } else{
		 * System.out.println("1st no is smaller than 2nd no \n"); } sc.close();
		 */

		/*
		 * To check whether char is vowel or consonant *
		 * 
		 * System.out.println("enter a char"); Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * String s = sc.next(); Character ch = s.charAt(0);
		 * 
		 * if(ch=='a'){ System.out.println(ch + " is vowel"); }else if(ch=='e'){
		 * System.out.println(ch + " is vowel"); }else if(ch=='i'){
		 * System.out.println(ch + " is vowel"); }else if(ch=='o'){
		 * System.out.println(ch + " is vowel"); }else if(ch=='u'){
		 * System.out.println(ch + " is vowel"); }else System.out.println(ch
		 * +" is Not a vowel");
		 * 
		 * sc.close();
		 */
		// To check the percentage

		/*
		 * System.out.println("Enter nmarks \n"); Scanner sc = new
		 * Scanner(System.in); int nmarks;
		 * 
		 * nmarks = sc.nextInt();
		 * 
		 * if(nmarks>100){ System.out.println("INVALID MARKS"); }else
		 * if(nmarks==100){ System.out.println("Grade is S"); }else
		 * if(nmarks>=90 && nmarks<100){ System.out.println("Grade is A"); }else
		 * if(nmarks>=80 && nmarks<90){ System.out.println("Grade is B"); }else
		 * if(nmarks>=70 && nmarks<80){ System.out.println("Grade is C"); }else
		 * if(nmarks>=60 && nmarks<70){ System.out.println("Grade is D"); }else
		 * if(nmarks>=50 && nmarks<60){ System.out.println("Grade is E"); }else
		 * System.out.println("Grade is F");
		 * 
		 * sc.close();
		 */

		// profit or loss

		/*
		 * Scanner sc = new Scanner(System.in); float dozenPrice; float
		 * amangoPrice; System.out.println("Enter price of A DOZEN mangoes \n");
		 * dozenPrice = sc.nextInt();
		 * System.out.println("Enter a mango sold out"); amangoPrice =
		 * sc.nextInt();
		 * 
		 * float perMango = dozenPrice/12;
		 * 
		 * float diffInPrice = amangoPrice - perMango; float PL =
		 * diffInPrice*12; if(dozenPrice<(amangoPrice*12)){
		 * System.out.printf("Profit is :%f",PL); } else{
		 * System.out.printf("Loss is :%f",PL); }
		 */

		// fees collection
		/*
		 * Scanner sc = new Scanner(System.in); float tutionfees; float busfees
		 * = 0; float hostelfees; String StudentType;
		 * 
		 * System.out.println("Enter Student type \n"); StudentType = sc.next();
		 * System.out.println("Enter tutionfees"); tutionfees = sc.nextInt();
		 * System.out.println("Enter busfees"); busfees = sc.nextInt();
		 * System.out.println("Enter hostelfees"); hostelfees = sc.nextInt();
		 * switch(StudentType) {
		 * 
		 * case "MSDS": float msds=tutionfees+busfees; System.out.println(msds);
		 * break;
		 * 
		 * case "MSH":
		 * 
		 * float msh=tutionfees+hostelfees; System.out.println(msh);
		 * 
		 * break; case "MGSDS":
		 * 
		 * float mgsds=(tutionfees+(tutionfees%2))+busfees;
		 * System.out.println(mgsds); break;
		 * 
		 * case "MGSH": float mgsh=(tutionfees+(tutionfees%2))+hostelfees;
		 * System.out.println(mgsh); break; }
		 */

		// Lab allocation1
		/*
		 * Scanner sc = new Scanner(System.in); int l1; int l2; int l3;
		 * 
		 * System.out.println("Enter x \n"); l1 = sc.nextInt();
		 * 
		 * System.out.println("Enter y"); l2 = sc.nextInt();
		 * 
		 * System.out.println("Enter z"); l3 = sc.nextInt();
		 * 
		 * int minCap=Math.min(Math.min(l1, l2),l3);
		 * 
		 * if(l1==minCap){
		 * 
		 * System.out.println( "l1 has minimun capacity "); }
		 * 
		 * if(l2==minCap){
		 * 
		 * System.out.println( "l2 has minimun capacity ");
		 * 
		 * }
		 * 
		 * if(l3==minCap){ System.out.println( "l3 has minimun capacity ");
		 * 
		 * }
		 */

		/*
		 * //lab allocation 3
		 * 
		 * Scanner sc = new Scanner(System.in); int l1; int l2; int l3; int l4;
		 * System.out.println("Enter x \n"); l1 = sc.nextInt();
		 * 
		 * System.out.println("Enter y"); l2 = sc.nextInt();
		 * 
		 * System.out.println("Enter z"); l3 = sc.nextInt();
		 * 
		 * System.out.println("Enter n"); l4 = sc.nextInt();
		 * 
		 * int count=0; if(l4<l1){
		 * 
		 * count++;
		 * 
		 * //System.out.println( "l1 has minimun capacity "); }
		 * 
		 * if(l4<l2){ count++; // System.out.println(
		 * "l2 has minimun capacity ");
		 * 
		 * }
		 * 
		 * if(l4<l3){ count++;
		 * 
		 * //System.out.println( "l3 has minimun capacity ");
		 * 
		 * }
		 * 
		 * System.out.println(count+" labs are allocatated ");
		 * 
		 * }
		 */

		// seat allocation
		Scanner sc = new Scanner(System.in);
		int l1;
		int l2;
		int l3;

		System.out.println("Enter no. of rows \n");
		l1 = sc.nextInt();

		System.out.println("Enter no.of column");
		l2 = sc.nextInt();

		System.out.println("Enter roll no. of student");
		l3 = sc.nextInt();

		/*
		 * if(l3<=10){ System.out.println("yes"); }
		 */
		/*for (int i = 1; i <= 10; i++) {
			if (l3 == i) {
				System.out.println("yes");
			}
		}*/
			for (int i = 1; i <= 10; i++) {
			if (l3 == i ) {
				System.out.println("yes");	
			}else{
				System.out.println("No");
				
				}
			}
			for (int j = 1; j < 5; j++) {
			if (l3 == ((j * 10) + 1)) {
					System.out.println("yes");
			}else{
				System.out.println("No");
				
				}
			}
			for (int k = 2; k <= 5; k++) {
			if (l3 == (k * 10)) {
			System.out.println("yes");
			}else{
			System.out.println("No");
				
			}
			}
			
	
	}
}
