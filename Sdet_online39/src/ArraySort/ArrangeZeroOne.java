package ArraySort;

public class ArrangeZeroOne {

	public static void main(String[] args) 
	{
		int[] a= {1,0,1,0,0,0,0,4,0,0};
		int[] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]==0)
				{
					b[n]=a[i];
					n--;
					
				}
				else
				{
					b[m]=a[i];
					m++;
				}
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
			}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
