
public class WrapperClass 

{
	public static void main(String[] args) 
	{
		int i = 5;
		Integer sp = new Integer(i);
		System.out.println(sp);
		int j = sp.intValue();
		System.out.println(j);
	}

}
