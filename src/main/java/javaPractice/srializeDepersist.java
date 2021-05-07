package javaPractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class srializeDepersist {

	public static void main(String[] args) {
		
		try{
			
		ObjectInputStream in= new ObjectInputStream(new FileInputStream("f.txt"));
		
		serializePrCT s=(serializePrCT)in.readObject();
		
		System.out.println(s.id+" "+s.name);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
