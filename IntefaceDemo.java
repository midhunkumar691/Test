
interface Abc
{
	public void show();
}
 
public class IntefaceDemo 
{
	public static void main(String[] args) 
	{
		Abc w = new Abc()
				{
			         public void show()
			         {
				     System.out.println("Dont play with my life java");
				     }
				};
	    w.show();
				
			
		
		
	}

}
