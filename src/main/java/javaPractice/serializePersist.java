package javaPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializePersist {
	
	public static void main(String[] args) {
		
		try{
			serializePrCT sp= new serializePrCT("shri", "deepShri");
			
			FileOutputStream fo= new FileOutputStream("f.txt");
			
			ObjectOutputStream out= new ObjectOutputStream(fo);
			
			out.writeObject(sp);
			
			out.flush();
			
			out.close();
			
			System.out.println("sucess");
			
			
			
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}

}
