
public class Pattern 
{
	public static void main(String[] args) {
		pattern();
	}
	public static void pattern()
	{
		for(int i = 65; i <= 69; i++) {
			for(int j = 65; j <= i; j++) {
				char a = (char) j;
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
