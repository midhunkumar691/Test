interface Fe
{
	public void show();
	
}
public class Lamda 
{
	public static void main(String[] args) 
	{
		Fe obj = () -> System.out.println("just get out of my things");
		obj.show();
	}
	

}
