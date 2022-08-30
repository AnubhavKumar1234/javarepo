package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfOccurenceOfStringLaptopUsingScannerClass {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1=sc.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i)+"="+(i+1));
		}

	}		
}


	

	


