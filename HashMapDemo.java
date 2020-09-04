import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo
{
	public static void main(String[] args) 
	{
		//HashMap<Integer, String> hm = new HashMap<>();
		//LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
		TreeMap<Integer, String> lm = new TreeMap<>();
		lm.put(0, "andy");
		lm.put(90, "kumar");
		lm.put(76, "ganesh");
		lm.put(54, "chaitu");
		lm.put(60, "venky");
		lm.put(21, "praveen");
		lm.put(86, "fun");
		System.out.println(lm.toString());
		System.out.println(lm.keySet());
		System.out.println(lm.get(1));
		System.out.println(lm.values());
		System.out.println(lm.containsKey(5));
		
		lm.remove(6);
		System.out.println(lm.toString());
;		
	}

}
