import java.util.Scanner;

public class OddEven 
{
	int number;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(" enter the number");
		if (number % 2 == 0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println(" Number is odd");
		}
		
		System.out.println(" DONE");
		
	}

}
