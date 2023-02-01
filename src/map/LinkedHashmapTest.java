package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmapTest {
public static void main (String args[])
{
LinkedHashMap<Integer, Integer>	 lm = new LinkedHashMap<>();
lm.put(1, 10);
lm.put(10, 5);
lm.put(2, 50);
lm.put(6,100);
System.out.println(lm);
System.out.println(lm.values());
System.out.println(lm.keySet());
System.out.println(lm.entrySet());
System.out.println(lm.remove(10, 10));
lm.replace(10, 10);
System.err.println(lm);
  HashMap <Integer,Integer> h = (HashMap<Integer, Integer>) lm.clone();
  System.out.println("Test"+h);
System.out.println(lm);


}
}
