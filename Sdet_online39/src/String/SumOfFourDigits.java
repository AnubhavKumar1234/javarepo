package String;

public class SumOfFourDigits 
{
	public static void main(String[] args) 
	{
		String s="1a3b4";
		
		
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum+n;
			}
			
		}
		
		System.out.println(tsum);
		
		

	}

}
