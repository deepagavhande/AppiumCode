package javaPractice;

class animal{
	
	void eat(){
		
		System.out.println("eating");
		
	}
	
}

class dog extends animal{
	
	void bark(){
		
		System.out.println("barking");
		
	
	}
	
}

class inHerirancePrac extends dog{
	
	void weep(){
		
		System.out.println("weeping");
	}
	
	public static void main(String[] args) {
		
	/*dog d=new dog();
	
	d.eat();
	d.bark();
	
	animal an= new animal();
	
	an.eat();*/
		
		//
	//mulitilevel inheritence
		
		inHerirancePrac ip=new inHerirancePrac();
		ip.eat();
		ip.bark();ip.weep();
}
}