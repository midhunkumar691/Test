
public class Increment {

	     public static void main(String []args){
	         
	         int money = 5;
	         int test = money++;	//money = 5 test = 5

	        System.out.println("Test is : " + test++);
	        test = money + 4; // money = 6 test = 10
	        System.out.println("Money is : " + money--);
	        test = 5 + money; // money = 5 test = 10
	        System.out.println("Test is : " + --test);
	        money = money++; // 
	        
	        System.out.println("Money is : " + money);
	        test = test++ + --money;
	        
	        System.out.println("Test is : " + test);
	        System.out.println("Money is : " + money);
	        

	     }
	    
	}	