import java.util.Scanner;

public class CheckPassFail
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark = sc.nextInt();
		System.out.print("The value of mark is : ");
		System.out.print(mark);
		if(mark>=50)
		{
			System.out.println(" \n PASS");
			
		}
		else
		{
			System.out.println(" \n FAIL");
		}
		System.out.println("DONE");
	}
	
	}


