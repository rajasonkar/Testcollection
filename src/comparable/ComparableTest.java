package comparable;

public class ComparableTest implements Comparable<ComparableTest>{
	int rollno;  
	String name;  
	int age;  
	ComparableTest(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;
	} 
public int compareTo(ComparableTest o) {
	if(age==o.age)  
		return 0;  
		else if(age>o.age)  
		return -1;  
		else  
		return 1; 
}
}
