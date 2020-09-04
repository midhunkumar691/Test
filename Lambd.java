interface Swim
{
	void add();
	

}


public class Lambd 
{
	public static void main(String[] args)
	{
		Swim s = ()->{
		System.out.println("Hello Senorita");
			        
	};
				
				s.add();
		
	}
}

