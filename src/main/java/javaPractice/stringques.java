package javaPractice;

import java.util.HashMap;
import java.util.Scanner;

public class stringques {

	//no. of occurance of no.
	
	/*public static void characterCount(String charcount ){
		
		HashMap<Character, Integer> countMap= new HashMap<Character, Integer>();
		
		char[] countArray=charcount.toCharArray();
		
		for(char c:countArray){
			
			if(countMap.containsKey(c)){
				
				countMap.put(c, countMap.get(c)+1);
			}
			else
			{
				countMap.put(c, 1);
			}
		}
		
		System.out.println(charcount+ " : "+countMap);
		
		}*/
	
	// white spaces removal
	
	// anagram program
	
	/*public static boolean isanagram(String word,String anagram){
		
		if(word.length()!=anagram.length()){
			
			return false;
		}
		char [] chars=word.toCharArray();
		
		for(char c:chars){
			
			int index=anagram.indexOf(c);
			
			System.out.println();
			
			if(index!=-1){
				
				anagram=anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
				System.out.println(anagram);
			}
			
			else{
				
				return false;
				
			}
		}
		
		return anagram.isEmpty();
		
	}
	*/
	
	//first non repeated character
	
	public static void main(String[] args) {
		
		//characterCount("shripal khandepal");
		
	/*	Scanner sc= new Scanner(System.in);
		
		System.out.println("enter input String");
		
		String inputString=sc.nextLine();
		
		String stringWithoutSpace=inputString.replaceAll("\\s+", "");
		
		System.out.println("inputString:" +inputString);
		
		System.out.println("stringWithoutSpace:" +stringWithoutSpace);
		
		sc.close();
		*/
		//System.out.println(isanagram("army","mary"));
		String s="army";
		String s1="mary";
		//anagram=anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
		
		System.out.println(s.substring(0,2)+s.substring(1,s.length()));
		
	}
}
