package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LL {
public static void main(String args[])
{
	LinkedList<Object> ll = new LinkedList<>();
	ll.add(10);
	ll.add("raja");
	ll.add("sonkar");
	ll.add("Raja");
	ll.add(20);
	ArrayList<String> al = new ArrayList<>();
	al.add("sd");
	al.add("dd");
	ll.addAll(al);
	System.out.println(ll);
	
	System.out.println(ll.isEmpty());
	ll.addFirst(321);
	ll.addLast(789);
	System.out.println(ll.getLast());
	System.out.println(ll.getFirst());
	System.out.println(ll);
	ll.add(1, "element");
	System.out.println(ll);
	//ll.sort(null);
	System.out.println(ll.get(5));
	ll.offer("offer");
	System.out.println(ll);
	ll.offerFirst("offerFirst");
	System.out.println(ll);
	System.out.println(ll.peek());
	System.out.println(ll.peekFirst());
	System.out.println(ll.poll());
	System.out.println(ll);
	ll.push("hg");
	System.out.println(ll);
}
}
