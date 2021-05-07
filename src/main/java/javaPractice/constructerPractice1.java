package javaPractice;

public class constructerPractice1 {
	
	//constructor chaining
	
	int id,age;
	
	String name,addresss;
	
	public constructerPractice1(int age){
		
		this.age=age;
		
	}
	
	
public constructerPractice1(int id,int age){
	
		this(age);
		this.id=id;
		
	}

public constructerPractice1(int id,int age,String name,String address){
	
	this(id,age);
	
	this.name=name;
	
	this.addresss=address;
	
}
	public static void main(String[] args) {
	
		/*constructerPractice1 emp=new constructerPractice1(1,20,"deepa","khamgaon");
		
	System.out.println(emp.id+" "+emp.age+" "+emp.name+" "+emp.addresss);*/
	
	constructerPractice1 T = new constructerPractice1(35);
	constructerPractice1 T1 = new constructerPractice1(3);
	System.out.println(T1.age);
	
	}
	

}
