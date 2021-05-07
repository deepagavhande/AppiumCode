package javaPractice;

public class monkeyresolution extends animalResolution{
	
	public void rom(int i){
		
		System.out.println("i m tom");
		
	}
	
public void tom(int i){
		
		System.out.println("i m not tom");
		
	}
	
	public static void main(String[] args) {
		
		animalResolution a=new animalResolution();
		a.tom(10);
	
		
		monkeyresolution b= new monkeyresolution();
		
		b.tom(10);
		
		animalResolution ab=new monkeyresolution();
		
		ab.tom(10);
	
	}

}
