package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSorting {
public static void main(String args[])
{
	ArrayList< ComparableTest> al = new ArrayList<>();
	al.add(new ComparableTest(1, "r", 25));
	al.add(new ComparableTest(1, "a", 30));al.add(new ComparableTest(1, "r", 20));
	for(ComparableTest st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
	Collections.sort(al);
	//Collections.reverse(al);
	for(ComparableTest st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
	System.out.println(al);
}
}
