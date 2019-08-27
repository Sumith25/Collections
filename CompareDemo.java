package collection;
import java.util.*;
class Student_ implements Comparable<Student_> {

	int roll;
	String name;
	int age;
	Student_(int rollno,String name,int age){
		this.roll=rollno;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student_ s)
	{
		if(age == s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else return -1;
	}
}

public class CompareDemo{
	public static void main(String [] args)
	{
		ArrayList<Student_> a1 =new ArrayList<Student_>();
		a1.add(new Student_(101,"Ajay",26));
		a1.add(new Student_(102,"Ajit",23));
		a1.add(new Student_(103,"Amar",22));
		Collections.sort(a1);
		for(Student_ s : a1)
		{
			System.out.println(s.roll +" "+s.name+" "+s.age);
		}
	}
}
