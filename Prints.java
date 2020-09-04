
public class Prints 
{
	int odd;
	int i;
	
	void odd()
	{
		for(i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("  Odd Numbers are" +i);	
			}
			}
		}
void even()
{
	for(i=0;i<=100;i++)
	{
		if(i%2==0)
		{
			System.out.println("even numbers" +i);
		}
		
	}
}
void revodd()
{
	for(i=100;i>=1;i--)
	{
		if(i%2!=0)
		{
			System.out.println("  REV Odd Numbers are" +i);	
		}
	}
}
void reveven()
{
	System.out.print("  REV Even Numbers are\n");
	for(i=100;i>=1;i--)
	{
		if(i%2==0)
		{
			System.out.print(i +" ");	
		}
	}
	
}
public static void main(String[] args)
{
	Prints pt = new Prints();
	pt.odd();
	pt.even();
	pt.revodd();
	pt.reveven();
	
}
}
