package String;

public class PositionOfEachCharacter {

	public static void main(String[] args) 
	{
		String s="tester";
//		String s1 = s.toLowerCase();
//		String s2 = s.toUpperCase();
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+"="+(i+1));
		}
		

	}

}
