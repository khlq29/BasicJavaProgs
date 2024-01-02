package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = n; 
		int rev=0;
	    int rem;
		
	            
	    	 while(temp!=0)
	 		{
	 			rem=temp%10;
	 			System.out.println(rem);
	 			rev=rev*10+rem;
	 			System.out.println(rev);
	 			temp = temp/10;
	 			System.out.println(temp);
	 		}
	    	 
            String res = n==rev?"pall":"notpall";
            System.out.println(res);
		/*
		if(n==rev)
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("it is not palindrome ");
		}*/

	}

}
