package javaPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		// convert array to array list 
		//using Arrays.aslist() method
		String[] array= {"a","b","c","d"};
		/*List L1=Arrays.asList(array);
		System.out.println(L1);*/
		//using collections.addAll() method
		
		/*List L2= new ArrayList();
		Collections.addAll(L2, array);
		System.out.println(L2);*/
		
		//using iterative method
		/*List L3=new ArrayList();
		for(String test:array){
			L3.add(test);	
		}
		System.out.println(L3);*/
		
		// merging of two arrays
		
		/*int a[]={1,23,4,5,6};
		int b[]={4,5,4,7,6};
		int Asize = a.length;
		int Bsize = b.length;
		int c[]=new int[Asize-1+Bsize];
		
		System.arraycopy(a, 1, c , 0, Asize-1);
		System.arraycopy(b, 0, c , Asize-1, Bsize);
		 
		System.out.println(Arrays.toString(c));
		
		getterSetterEg obj= new getterSetterEg();
		
		obj.setNumber(12);
		*/
		/*Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first no.");
		int num1=sc.nextInt();
		//System.out.println(num);
		System.out.print("Enter the second no.");
		int num2=sc.nextInt();
		if(num1<num2){
			System.out.println("num1 is less than num2");
			
			}
		else if(num1<num2){
			System.out.println("num1 is greater than num2");
		}
		else{
			System.out.println("num1 is equal to num2");
		
		}
		*/
		// vowels pragram else if
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter character");
		String ch=sc.nextLine();
		if(ch.equals("a")|| ch.equals("i")|| ch.equals("o")|| ch.equals("u")){
			System.out.println("Vowel");
		}
		
		else{
			System.out.println("consonent");
		}
		
		
		
		
	
	
	}
}
