package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueTest {

	public static void main (String agrs[])
	{
		Deque<String> d =new ArrayDeque<>();
		d.addLast("Raja");
		d.add("sonkar");
		d.addFirst("MR.");
		d.addLast("Test");
		System.out.println(d);
		System.out.println(d.getLast());
        System.out.println(d.getFirst());
        System.out.println(d.size());
        d.offerFirst("hs");
        System.out.println(d);
        
	
	
	}
}
