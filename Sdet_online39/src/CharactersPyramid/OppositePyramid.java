package CharactersPyramid;

public class OppositePyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=8;j>i;j--)
			{
				System.out.print("A ");
			}
			for(int j=8;j>=i;j--)
			{
				System.out.print("A ");
			}
			System.out.println(" ");
		}

	}

}
