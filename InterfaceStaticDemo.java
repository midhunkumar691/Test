interface In
{
	void fog();
	static void sub()
	{
		int a = 12;
		int b= 6;
		int result = a-b;
		System.out.println(result);
	}
}
public class InterfaceStaticDemo 
{
	public static void main(String[] args)
	{
		In.sub();
		
	}

}
