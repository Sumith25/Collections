package collection;
import java.util.*;
class Student implements Comparable<Student> {

	int roll;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.roll=rollno;
		this.name=name;
		this.age=age;
	}
	
	public int comapareTo(Student s)
	{
		if(age == s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else return -1;
	}
}

public class compare{
	public static void main(String [] args)
	{
		ArrayList<Student> a1 =new ArrayList<Student>();
		a1.add(new Student(101,"Ajay",23));
		a1.add(new Student(102,"Ajit",23));
		a1.add(new Student(103,"Amar",23));
		Collections.sort(a1);
		for(Student s : a1)
		{
			System.out.println(s.roll +" "+s.name+" "+s.age);
		}
	}
}
