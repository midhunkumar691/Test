
public class SumOfSquares 
{
	int i;
	int sum=0;
	int square;
	
	void add()
	{
		for(i=0;i<+100;i++)
		{
			square=i*i;
			sum= square+sum;
		}
		System.out.println(" Sum of average is " +sum);
	}
	
	 public static void main(String[] args)
	 {
		 SumOfSquares sos = new SumOfSquares();
		 sos.add();
		
	}
	

}

