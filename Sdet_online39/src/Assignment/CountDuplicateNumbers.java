package Assignment;

import java.util.LinkedHashSet;

public class CountDuplicateNumbers 
{
	public static void main(String[] args) 
	{
		int[] a= {4,1,1,3,5,6,7,6};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer val:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				
				if(val==a[i])
				{
					count++;
					
				}
			}
			
			if(count>1)
			{
				System.out.println(val+" "+count);
			}
		}

	}

}
