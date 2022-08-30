package ArraySort;


	public class FindFirstMinAndSecondMin {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a= {20,30,15,0};
			int min1=a[0];
			System.out.println(min1);
			for(int i=1;i<a.length;i++)
			{
				if(min1>a[i])
				{
					min1=a[i];
				}
				
			}
			System.out.println("FirstMin no is:="+min1);
			
			int min2=a[0];
			//System.out.println(min2);
			for(int i=1;i<a.length;i++)
			{
				
				if(a[i]<min2 && a[i] >min1)
				{
					min2=a[i];
				}
				
			}
			System.out.println("Second Min no is:="+min2);
			
		}

	}


