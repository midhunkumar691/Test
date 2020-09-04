
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo
{
	public static void main(String[] args)
	{
	    List<Integer> values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(1);
		values.add(10);
		values.add(3);
		values.add(8);
		
		
//         Collections.sort(values, c);

		
		for(Integer p : values)
		{
			System.out.println(p);
		}
		
		
	   
	}

}
