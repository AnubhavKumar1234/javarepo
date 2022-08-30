package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfOccurenceOfStringUsingScannerClassAndForEachLoop {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1=sc.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		
		for(Character ch:set)
		{
			for(int i=0;i<s1.length();i++)
			{
			  if(ch==s1.charAt(i))
			   {
				  System.out.println(ch+" "+(i+1));
				  break;
				
			   }
			}
			
		}
		

	}

}
