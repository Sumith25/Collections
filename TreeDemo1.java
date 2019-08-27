package map;
import java.util.*;

public class TreeDemo1 {
	
	public static void main(String[] main)
	{
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1,"Data1");
		map.put(23,"Data2");
		map.put(70,"Data3");
		map.put(4,"Data4");
		map.put(2,"Data5");
		
		Set set =map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			System.out.println("Key is:"+m.getKey()+"& Value is:");
			System.out.println(m.getValue());
		}
	}

}
