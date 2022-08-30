package ArraySort;

public class FindFirstMaxNo {

	public static void main(String[] args) 
	{
		int[] a= {4,1,2,3,0};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)//fetching elements from array one by one
			
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		

	}

}
