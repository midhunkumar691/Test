
public class GivenNumbersAverage
{
	int i;
	int sum=0;
	int count;
	int avg=0;
	int m=111;
	int n=889;
	void add()
	{
		for(i=111;i<=889;i++)
		{
			sum=sum+i;
			count=n-m;
			avg=sum/count;
			
		}	
		}
		
public static void main(String[] args) 
{
	GivenNumbersAverage aveg = new GivenNumbersAverage();
	aveg.add();
	System.out.println(aveg.avg);
}
}
