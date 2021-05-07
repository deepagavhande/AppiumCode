package javaPractice;

public class interviewProg {
	
	public static void main(String[] args) {
		
		String s="How Good God . Is";
		//wordcount(s);
		
		System.out.println("words"+ " "+wordcount(s));
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isUpperCase(s.charAt(i))){
				
				count++;
				//char ch=s.charAt(i);
				//System.out.println(count);
			}
		}
		
		System.out.println("uppercase letters are:"+" "+count);
		
		//no.of vowels
		
		for(int k=0;k<s.length();k++){
			
			char ch1=s.charAt(k);
			
			if(ch1=='a'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='e'){
				
				count++;
				
			}
			
		}
		
		System.out.println("no. of vowels :"+" "+count );
		
		//find the frequency
		
		int[] freq=new int[s.length()];
		
		char[] sh1=s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			
			freq[i]=1;
			
			for(int j=i+1;j<s.length();j++){
				
				if(sh1[i]==sh1[j]){
					
					freq[i]++;
					
					sh1[j]='0';
					
					
					}
					
				}
		
			}
		
		
		
		for(int i=0;i<freq.length;i++){
		
			
		if(sh1[i]!='0')
			
		System.out.println("character"+" "+sh1[i]+"-"+"frequency"+":"+freq[i]);
		
		}
		
}
	

	
	
static int wordcount(String str){
	
	int count=0;
	
	char ch[]=new char[str.length()];
	
	for(int i=0;i<str.length();i++){
		
		ch[i]=str.charAt(i);
		
		if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))
			/*System.out.println(i);
			System.out.println(ch[i]);*/
			
			count++;
	}
	return count;
	
}



}
