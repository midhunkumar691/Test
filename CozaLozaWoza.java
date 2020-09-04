
public class CozaLozaWoza 
{
	int i;
	int coza;
	int loza;
	int woza;
	int cozaloza;
	
	void pri()
	{
		for(i=1;i<=110;i++)
		{
			if(i%11!=0)
			{
				System.out.print(i);
				i++;
			}
			else
			{
				System.out.println("\n");
			}
			i++;
		}
	}
	public static void main(String[] args) 
	{
		CozaLozaWoza pree = new CozaLozaWoza();
		pree.pri();
		
		
	}

}
