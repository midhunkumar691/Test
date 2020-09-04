class Human
{
	 int i=9;
	
	public void eat()
	{
		// int i = 4;
		System.out.println(" how are u");
	}
}
	class Girl extends Human
	{
		// int i=5;
		
		 public void eat()
		{
			 super.eat();
			 
			 int i=7;
			 System.out.println(" mind your own business" + i);
		}
	}

public class Demo 
{
public static void main(String[] args) 
{
Human obj = new Girl();
	obj.eat();
	System.out.println(obj.i);
	
	
	
}
}
