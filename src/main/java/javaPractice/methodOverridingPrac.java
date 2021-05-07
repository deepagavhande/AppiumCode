package javaPractice;

public class methodOverridingPrac {
	
	public void baseMethod(){
		
		System.out.println("Base method");
	}
public static void main(String[] args) {
	String sb = new String("shri");
	String sb1 = new String("shri");
	
	System.out.println(sb.equals(sb1));
	System.out.println(sb==sb1);
}
}

class toExtend{
	
	public void m1(){
		System.out.println("m1");
	}
}