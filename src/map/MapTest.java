package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m = new HashMap<Integer,String>();
		m.put(10,"raja");
		m.put(5, "sonkar");
		m.put(8, "mumbai");
		m.put(4, "Thane");
		m.put(2, "Bhopal");
		m.putIfAbsent(7, "value");
		m.putIfAbsent(7, "newvalue");
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		m.put(4, "test");
		System.out.println(m);
		for(Entry<Integer, String> h :m.entrySet())
		{
			System.out.println("test"+h);
		}
		   Set s  = m.entrySet();
		   Iterator itr =  s.iterator();
		   while(itr.hasNext())
		   {
			 System.out.println(itr.next());  
		   }

		   
	}

}
