class Any
{
	public void show()
	{
		System.out.println("java");
	}
}




public class AnonymousClass
{
public static void main(String[] args) 
{
	Any d = new Any()
			{
		public void show()
		{
			System.out.println(" why r u bothering me");
		}
		
			};
	d.show();
	
}
}
