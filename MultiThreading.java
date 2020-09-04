

public class MultiThreading
{
	public static void main(String[] args) throws Exception
	{
		Runnable obj1 =() ->
				
			
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Java is simple");
					try {Thread.sleep(1000);} catch(Exception e) {}
				
				}
			}
			
				;
		Runnable obj2 = () ->
			{
				for(int j=1;j<=5;j++)
				{
					System.out.println("Java is robust");
					try {Thread.sleep(1000);} catch(Exception e) {}
				}
				
			}
				;
				Thread t1 = new Thread(obj1);
				Thread t2 = new Thread(obj2);
				t1.setName("budda thread");
				t2.setName("Pedda Thread");
				System.out.println(t1.getName());
				System.out.println(t2.getName());
				t1.start();
				t2.start();
				System.out.println(t1.isAlive());
				System.out.println(t2.isAlive());
		t1.join();
		t2.join();
		System.out.println("Task completed....");
		
		
		
		
	}

}
