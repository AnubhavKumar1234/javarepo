package String;

public class FindMinLengthStringNumberInArray 
{
	public static void main(String[] args) 
	{
		String[] s= {"12","123","1234","123456","1234"};
		String minlength=s[0];
		System.out.println(minlength.length());
		
		for(int i=1;i<s.length;i++)
		{
			System.out.println(s[i].length());
			if(minlength.length()>s[i].length())
			{
				minlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(minlength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

	}

}
