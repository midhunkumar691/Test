class Calc
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i : n)
		{
			sum = sum+i;
		}
		return sum;
	}
}
public class VaragsDemo
{
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		System.out.println(obj.add(5,66,99,45,234));
		
	}
	

}
