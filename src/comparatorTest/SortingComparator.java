package comparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingComparator {
public static void main (String args[])
{
ArrayList al = new ArrayList<>();

al.add(new Student(10, "r", 50));
al.add(new Student(11, "A", 22));
al.add(new Student(12, "z", 99));

Collections.sort(al,new AgeComparator());
Iterator itr = al.iterator();
while(itr.hasNext())
{
	Student st = (Student)itr.next();
System.out.println(st.rollno +" "+st.name+" "+st.age);	
}

}
}
