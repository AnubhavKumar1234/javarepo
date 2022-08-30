package String;

import java.util.LinkedHashSet;

public class CountingNumberOfTimesCharactersRepeating 
{
	public static void main(String[] args) 
	{
		String s="tester";
//		String s1 = s.toLowerCase();
//		String s2 = s.toUpperCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			
			
		}
		System.out.println(set);
		
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				
			}
			System.out.println(ch+"=   "+count);

}
	}
}
