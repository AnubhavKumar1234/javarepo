package String;

public class StringPallindrome {

	public static void main(String[] args) 
	{
		String s="mom";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			  rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("It is a pallindrome number");
		}
		else
		{
			System.out.println("It is not a pallindrome number");
		}
		

	}

}
