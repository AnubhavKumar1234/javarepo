package ArraySort;

public class FindFirstMinNo {

	public static void main(String[] args) 
	{
		int[] a= {4,1,2,3,0};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)//fetching elements from array one by one
			
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
		

	}

}
