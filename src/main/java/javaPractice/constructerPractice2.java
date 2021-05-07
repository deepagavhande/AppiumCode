package javaPractice;

public class constructerPractice2 {

	int age;
	String name,address;
	
	public constructerPractice2(int age,String name,String address ){
		
		this.age=age;
		this.name=name;
		this.address=address;
	
		
	}
	

}

class emp extends constructerPractice2{
	
	float salary;

	public emp(int age, String name, String address,float salary) {
		
		super(age, name, address);
		
		this.salary=salary;
		
	}
		
}


