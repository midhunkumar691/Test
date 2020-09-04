
public class StateBank implements BankDem
{

	@Override
	public void name()
	{
		System.out.println(" Name : Andi");
		
	}

	@Override
	public void lastname()
	{
		System.out.println(" Last Name :Johnson");
		
		
	}

	@Override
	public void checkings() {
		System.out.println("Savings : 100 dollars");
		
	}

	@Override
	public void savings() {
		System.out.println(" Checkings : 0 dollars");
		
	}

	@Override
	public void bankname() {
		System.out.println("Name is : State Bank Of India");
		
	}
	

}
