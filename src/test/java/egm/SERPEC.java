package egm;

public class SERPEC {

	
	
	public static void main(String[] argsq) {
		
		String s = "vcevsbhjebvhjveshj!@#$%^&*(){}15641686413516841685841";
		String alpha = "";
		String num ="";
		String sp = "";
		
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || (s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				alpha = alpha + s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num + s.charAt(i);
			}
			else 
			{
				sp = sp+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
	}
}
