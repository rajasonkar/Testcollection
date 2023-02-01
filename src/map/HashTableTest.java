package map;

import java.util.Hashtable;

public class HashTableTest {
public static void main(String args[])
{
Hashtable<Integer,Integer> ht = new Hashtable<>();
ht.put(10, 1);
ht.put(1, 10);
ht.put(9, 2);
ht.put(4, 6);
ht.put(8, 3);
ht.put(8, 33);
ht.put(15, 15);
System.out.println(ht);


}
}
