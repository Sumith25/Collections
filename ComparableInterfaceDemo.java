package collection;
import java.util.*;
class Employee implements Comparable<Employee>
{
    String name;
    int age;
    int experience;
    
    public Employee(String name, int age, int experience) // LINE A
    {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    
    public String toString() // LINE B
    {
        return "Name : " + name + " Age : " + age + " Experience : " + experience;
    }
    
    public int compareTo(Employee o) // LINE C
    {
        return experience - o.experience;
    }
}

public class ComparableInterfaceDemo
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList(); // LINE D
        list.add(new Employee("Siva", 35, 12));
        list.add(new Employee("Maheesh", 25, 3));
        list.add(new Employee("Narayan", 26, 2));
        list.add(new Employee("Srinath", 24, 3));
        System.out.println(list); // LINE E
        Collections.sort(list); // LINE F
        System.out.println(list);
    }
}

