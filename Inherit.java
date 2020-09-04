class Calculator
{
	public int add(int i , int j)
	{
		return i+j;
	}
}
public class Inherit {
	public static void main(String[] args) 
	{
		Calculator ob = new Calculator();
		int result = ob.add(5,8);
		System.out.println(result);
		
	}

}
