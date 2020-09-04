import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str = "Kumar";
		String reverse="";
		
		for(int i= str.length()-1; i>=0; i-- )
		{
			reverse = reverse+str.charAt(i);
			
		}
		
		
		System.out.print(reverse);
		
		
	 }
	
}
