import java.util.Scanner;

public class Cal
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int opt = sc.nextInt();
		
		if(opt==1)
	    {
	    	Scanner op = new Scanner(System.in);
	    	System.out.println("Enter the first number");
	    	int dec = op.nextInt();
	    	Scanner op1 = new Scanner(System.in);
	    	System.out.println("Enter second number");
	    	int dec1 = op1.nextInt();
	    	 int addition = dec + dec1;
	    	 System.out.println("Addition of two numbers is" +  addition);
	     }
		else if(opt==2)
		{
			Scanner op = new Scanner(System.in);
	    	System.out.println("Enter the first number");
	    	int dec = op.nextInt();
	    	Scanner op1 = new Scanner(System.in);
	    	System.out.println("Enter second number");
	    	int dec1 = op1.nextInt();
	    	 int sub = dec - dec1;
	    	 System.out.println("subtraction of two numbers is" + sub);
		}
		else if(opt==3)
		{
			Scanner op = new Scanner(System.in);
	    	System.out.println("Enter the first number");
	    	int dec = op.nextInt();
	    	Scanner op1 = new Scanner(System.in);
	    	System.out.println("Enter second number");
	    	int dec1 = op1.nextInt();
	    	 int mul = dec * dec1;
	    	 System.out.println("multiplication of two numbers is" + mul);
		}
		else if(opt==4)
		{
			Scanner op = new Scanner(System.in);
	    	System.out.println("Enter the first number");
	    	int dec = op.nextInt();
	    	Scanner op1 = new Scanner(System.in);
	    	System.out.println("Enter second number");
	    	int dec1 = op1.nextInt();
	    	 int div = dec + dec1;
	    	 System.out.println("divison of two numbers is " +  div);
		}
		
	
		
		
	}

}
