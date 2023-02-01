package set;


import java.util.TreeSet;

public class TreeSetTest {
public static void main (String args[])
{
TreeSet<String> ts = new TreeSet<String>();
ts.add("RAja");
ts.add("abc");
ts.add("ab");
ts.add("aa");
//default natural sorting order
System.out.println(ts);
TreeSet<Integer> t = new TreeSet<Integer>();
t.add(1);
t.add(50);
t.add(20);
t.add(16);
t.add(27);
System.out.println(t);
System.out.println(t.ceiling(15));
System.out.println(t.ceiling(49));
System.out.println(t.descendingIterator());
System.out.println(t.descendingSet());
System.out.println(t.headSet(20));
System.out.println(t.headSet(50));
System.out.println(t.headSet(1));
//	System.out.println(t.headSet(null));
System.out.println(t.subSet(4, 40));
System.out.println(t.tailSet(20));
System.out.println(t.tailSet(20, true));
System.out.println(t.tailSet(20,false));



}
}
