
public class TwodArray
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,10,11,12};
		
		int d[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		
		
	//	for( int i=0; i<=2;i++)
	//	{
		//	for (int j=0; j<=3; j++)
		//	{
		//		System.out.print(" " +d[i][j]);
		//	}
		//	System.out.println();
	//	}
		
		for(int k[] : d)
		{
			for( int l:k)
			{
				System.out.print(" " +l);
			}
			System.out.println();
		}
	}

}
