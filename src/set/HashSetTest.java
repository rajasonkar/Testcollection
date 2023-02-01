package set;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetTest {
public static void main(String args[])
{
HashSet<String> s = new HashSet<String>();	
s.add("100");
s.add("eedwd");
s.add("asaaa");
s.add("bca");
System.out.println(s);
Iterator<String> li = s.iterator();
while(li.hasNext())
{
System.out.println(li.next());	
}
s.remove("bca");

System.out.println(s+"ccggg");
}
}