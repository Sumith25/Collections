package collection;
import java.util.ArrayList;
import java.util.Collections;
public class BasicArrayList {
	public static void main(String [] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java");
		a1.add("C++");
		a1.add("C");
		a1.add("PERL");
		a1.add("PHP");
		System.out.println(a1);
		System.out.println("Element at index 1:"+a1.get(1));
		System.out.println("Does list contains Java?"+a1.contains("Java"));
		a1.add(2,"Play");
		System.out.println(a1);
		System.out.println("Is ArrayList Empty?"+a1.isEmpty());
		System.out.println("Index of Perl is "+a1.indexOf("PERL"));
		System.out.println("Size of the ArrayList:"+a1.size());
		Collections.sort(a1);
		System.out.println(a1);
	}

}
