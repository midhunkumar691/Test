
public class SumOfOddEven 
{
	int i;
	static int a[] = new int[2];
	int sume = 0;
	int sumo = 0;
	
    int[] adde()
    {
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sume=sume+i;
				
			}
			else
			{
				sumo=sumo+i;
			}
		}
		a[0]= sume;
		a[1]= sumo; 
		
    	return a;
    	
    }
	public static void main(String[] args) 
	{
		SumOfOddEven soeo = new SumOfOddEven();
		soeo.adde();
		System.out.println(" Sum of even number" +a[0]);
		System.out.println(" Sum of odd numbers" +a[1]);
		
	}
	
	
	}
	