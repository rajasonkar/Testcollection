package collectionsTestC;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList< String> al = new ArrayList<>();
al.add("1000");
al.add("1010");
al.add("1005");
al.add("1006");
al.add("1003");
al.add("100");

System.out.println(al);
Collections.synchronizedList(al);
Collections.sort(al);
System.out.println(al);
//Collections.reverse(al);
System.out.println(al);
String[] ar ={"200","400"};
Collections.addAll(al, ar);
System.out.println(al);
ArrayList< Integer> a = new ArrayList<>();
a.add(100);
a.add(105);
a.add(99);
Collections.sort(a);
System.out.println(Collections.binarySearch(a, 99));

int index = Collections.binarySearch(al, "1010");
System.out.println(index);
	}

}
