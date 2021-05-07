package collectionPrac;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {
	
	public static void main(String[] args) {
		
		HashMap m=new HashMap ();
		
		m.put("chiru", 700);
		
		m.put("bala", 800);
		
		m.put("venki", 200);
		
		m.put("naga", 500);
		
		System.out.println(m);
		
		System.out.println(m.put("chiru", 1000));
		
		Set s=m.keySet();
		
		System.out.println(s);
		
		Collection c=m.values();
		
		System.out.println(c);
		
		Set s1=m.entrySet();
		
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry m1=(Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+" "+m1.getValue());
			
			if(m1.getKey().equals("naga")){
				m1.setValue(2000);
			}
		}
		System.out.println(m);
	}

}
