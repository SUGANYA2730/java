import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer , String> map = new TreeMap<Integer , String>();
		
		map.put(101, "Mango");
		map.put(102, "Orange");
		map.put(103, "Apple");
		map.put(104, "Banana");
		map.put(102, "Orange");//duplicate entry
		//map.put(null, null);// null entry
		map.put(108, null);// null value
		
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		
		
	}

}