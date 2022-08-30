package ArraySort;

public class AdditionOfTwOArray {

	public static void main(String[] args) 
	{
//		int[] a= {20,40,30,12,25};
//		int[] b= {20,25,32,15,20};
		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			System.out.println(a[i]+b[i]);
//		
//		
////		for(int j=0;j<=i;j++)
////		{
////			
////			
////			System.out.println(a[i]+b[j]);
////		}
//		}
		int[] a= {5,1,2,4,2};
		int[] b= {2,3,1,5};
		
	int	length=a.length;//5
	
	
	if(a.length<b.length)//5<4
	{
		length=b.length;
	}

	for(int i=0;i<length;i++)
	{ 
		try
		{
			System.out.println(a[i]+b[i]);
		}
		catch(Exception e)
		{
			 if(a.length<b.length)
			 {
				 System.out.println(b[i]+ "");
				 
			 }
			 else
			 {
				 System.out.println(a[i]+ "");

			 }
		}
		 
	}
	} 
	 
}
		
		

	


