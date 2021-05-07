package javaPractice;

public class constructorPractice {

	static int count=0;
	
	{
		count++;
	}
	
	constructorPractice(){
		
	}
	
	public constructorPractice(int a){
		
	}
	
	public static void main(String[] args) {
		
		constructorPractice s= new constructorPractice();
		
		constructorPractice s1=new constructorPractice(10);
		
		constructorPractice s2=new constructorPractice();
		
		System.out.println(count);
	}
	
}
