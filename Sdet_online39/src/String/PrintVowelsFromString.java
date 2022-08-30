package String;

public class PrintVowelsFromString {

	public static void main(String[] args) 
	{
		String s="india";
		int count=0;
		char[] ar = s.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]=='a' || ar[i]=='e' || ar[i]=='i' || ar[i]=='o' || ar[i]=='u')
			{
				count++;
				
			}
			
		}
		System.out.print(count);
		
		

	}

}
