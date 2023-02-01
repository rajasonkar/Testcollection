package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
public static void main (String args[])
{
	
TreeMap<Integer,Integer> tm = new TreeMap<>();
tm.put(10, 10);
tm.put(1, 1);
tm.put(9, 9);
tm.put(2, 2);
tm.put(8, 8);
tm.put(3, 3);
System.out.println(tm);

System.out.println(tm.entrySet());
System.out.println(tm.lastKey());
System.out.println(tm.tailMap(2));
System.out.println(tm.firstKey());
System.out.println(tm.ceilingEntry(5));
System.out.println(tm.values());
System.out.println(tm.descendingKeySet());
System.out.println(tm.subMap(2, 8));
System.out.println(tm.higherEntry(2));
System.out.println(tm.navigableKeySet());
for(Map.Entry m:tm.entrySet())  
{  
    System.out.println(m.getKey()+" "+m.getValue());      
}  
}
}
