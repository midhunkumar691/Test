import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Streams
{
	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
	// 	for(int i=0;i<6;i++)
	//	{
	//		System.out.println(values.get(i));
	// }
		Iterator i = values.iterator();
		
	//	while(i.hasNext())
	//	{
	//		System.out.println(i.next());
	//	}
		
	for( int t : values)
	 {
	  System.out.println(t);
	} 
		// values.forEach(t->System.out.println(t));
	       values.forEach(Streams::doubleit);
	}	
	public static void doubleit(int t)
	{
		System.out.println(t*2);
	}

}
			