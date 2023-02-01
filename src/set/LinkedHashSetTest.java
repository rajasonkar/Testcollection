package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> lhs = new LinkedHashSet<String>();

lhs.add("RAJA");
lhs.add("raja");
lhs.add("raja");
lhs.add("abcd");
System.out.println(lhs.size());
System.out.println(lhs);

	}

}
