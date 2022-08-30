package String;

public class SwappingOfLastTwoWords {

	public static void main(String[] args) 
	{
		String str="welcome to bglr city";
		String[] s=str.split(" ");
			String temp=s[0];
			s[0]=s[s.length-1];
			s[s.length-1]=temp;
			
			for(int i=0;i<s.length;i++)
			{
				System.out.print(s[i]+" ");
			}
			
			
			
//			String strn = s[i];
//			for(int j=strn.length()-1;j>=4;j--)
//			{
//				System.out.print(strn.charAt(j));
//			}
//			System.out.print(" ");
		}
		

	}


