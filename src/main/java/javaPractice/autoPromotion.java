package javaPractice;

final class autoPromotion {
	
	 static int x=10;
	 
	 final int y=23;
	
	 void methodOne(int i){
		
		System.out.println("o args");
		
	}
	
	void methodOne(float f){
		
		System.out.println("1 args");
		
	}
	
	
	
	public static void main(String[] args) {
		
		autoPromotion ap=new autoPromotion();
		
		ap.methodOne('a');
		ap.methodOne(101);
		ap.methodOne(10.5f);
	
		
		
		
	}

}
