import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList iu = new ArrayList();
		//iu.add(23);
		//iu.add(45);
		//iu.add(54);
		//iu.add(90);
		//iu.add(60);
		//iu.add(75);
		for(int i=0;i<50;i++)
		{
			iu.add(i);
		}
		
		
		//System.out.println(iu.toString());
//		System.out.println(iu.size());
		//System.out.println(iu.get(3));
		
		Iterator it = iu.iterator();
		
	 while(it.hasNext())
		{
			 System.out.println(it.next());
			
			Integer in = (Integer)it.next();
			if(in%2 ==0)
			{
				System.out.println(in);
			}
			else
			{
				it.remove();
			}
		}
	}

}
