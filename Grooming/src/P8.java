
/*
	1*2*3*4
	 1*2*3
	  1*2
	   1
*/

class P8 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=0; i<n; i++)
		{
			int k=1;
			for (int j=0; j<i; j++)
			{
				System.out.print(' ');
			}
			for (int j=0; j<(n-i)*2-1; j++)
			{
				if (j%2==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(k++);
				}
			}
			System.out.println();
		}
	}
}
