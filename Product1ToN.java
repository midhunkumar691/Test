
public class Product1ToN
{
	int i;
	int product=1;
	
	void Mul()
	{
		for(i=1;i<+10;i++)
		{
			product=product*i;
		}
		System.out.println(" Product is " +product);
	}
	public static void main(String[] args) 
	{
		Product1ToN pron = new Product1ToN();
		pron.Mul();
		
	}
	

}
