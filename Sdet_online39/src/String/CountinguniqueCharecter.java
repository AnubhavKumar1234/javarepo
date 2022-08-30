package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountinguniqueCharecter{
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string: ");
	String s1=sc.nextLine();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
		//System.out.println(s1.charAt(i));
		set.add(s1.charAt(i));
//		System.out.println(set);
	}
for(Character ch:set)
{
//int count=0;
for(int i=0;i<s1.length();i++)
{
	if(ch==s1.charAt(i))
	{
		System.out.println(ch+" "+(i+1));
		break;
	}
	
}
//if(count==1)
//{
//	System.out.println(ch+" " +count);
//}

}
}



}
