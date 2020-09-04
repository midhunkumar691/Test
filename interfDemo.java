interface Ab
{
	void dot();
	default void show()
	{
		System.out.println("java is very easy");
	}
}
	interface Cd
	{
		default void show()
		{
			System.out.println(" but tough to understand");
		}
	}
	 class Efi implements Ab , Cd
	 {
		public void dot()
		{
			System.out.println(" in java");
		}
		public void show()
		{
			Cd.super.show();
		}
	 }
	

public class interfDemo 
{
	public static void main(String[] args) 
	{
		Ab g = new Efi();
		g.dot();
		g.show();
		
	}

}
