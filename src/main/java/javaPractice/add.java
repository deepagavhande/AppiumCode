package javaPractice;

public class add {
	
/*public int add(int x,int y){
	
	
	int z=x+y;

	return z;
	
}
public static long factorial(int x){
	
	if(x==1)return 1;
	
	return x*factorial(x-1);
	
}*/
public static void main(String[] args) {
	
	//add as= new add();
	//as.add(12, 20);
	//System.out.println(as.add(12, 20));
	//System.out.println(factorial(5));
	
	/*int number=5;
	
	long fact=1;
	
	for(int i=1;i<=number;i++){
		
		fact=fact*=i;
		
		System.out.println("factirial of"+ " "+number+" "+"is"+" "+fact);
	}
	*/
	/*
	//prime no.
	int n=11;
	int m=n/2;
	int flag=0;
	for(int i=2;i<=m;i++){
		
		if (n%2==0){
			System.out.println("given no.is not prime");
		
				flag=1;
				break;
				
	}}

		if(flag==0)
		{
			System.out.println("its prime");
		}
		
	}
	
	*/
	//prime no.
/*	int n=10;
	int num=1;
	int count=0;
	
	while(num<=n){
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;}
			
			}
		if(count==2){
			System.out.println(num);
		}
		count=0;
		num++;
	}
	*/
	/*int r,sum=0,temp;
	int n=454;
	
	
	temp=n;
	while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
if(temp==sum)
	System.out.println("pl");
else
	System.out.println("not pl");
}*/

	for(int i=5;i>=1;i--){
		
		for(int j=4;j>=i;j--){
			
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++){
			
			System.out.print("*");
		}
		System.out.println();
	}
}
}
	

