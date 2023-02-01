package list;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class AL {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> bl = new ArrayList<String>(5);
		bl.add("1");
		bl.add("1");
		bl.add("1");
		bl.add("1");
		bl.add("1");
		bl.add("1");
		bl.add("1");
		al.add("sd");
		
		al.add("sdcs");
		List<String> l = new ArrayList<>();
		l.add("Raja");
		l.add("10");
		l.add("Sonkar");
		l.add("Raja");
		System.out.println(l);
		l.addAll(al);
	
		l.set(5, "element");

		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(4));
		l.remove(4);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("Raja"));
		l.sort(null);
		System.out.println(l);
	//	l.clear();
		System.out.println("as" + l.size());
java.util.ListIterator<String> li = l.listIterator();
while(li.hasNext())
{
System.out.println(li.next());	
}
	}

}
