package String;

public class FindMaxLengthStringNumberInArray 
{
	public static void main(String[] args) 
	{
		String[] s= {"12","123","1234","123456","1234"};
		String maxlength=s[0];
		System.out.println(maxlength.length());
		
		for(int i=1;i<s.length;i++)
		{
			System.out.println(s[i].length());
			if(maxlength.length()<s[i].length())
			{
				maxlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(maxlength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

	}

}
