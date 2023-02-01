package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> q = new PriorityQueue<String>();
q.add("100");
q.add("Raja");
q.add("101");
q.add("101");
System.out.println(q);
System.out.println(q.peek());
System.out.println(q.element());
System.out.println(q.offer("no"));
System.out.println(q);
System.out.println(q.hashCode());
q.poll();
q.poll();
System.out.println(q);

	}

}
