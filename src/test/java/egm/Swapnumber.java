package egm;

public class Swapnumber {

	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
	
		a=b+a;
		b=a-b;
		a=a-b;
				
		
		System.out.println("New A value: "+a +"\nNew B value: "+b);
	}
}
