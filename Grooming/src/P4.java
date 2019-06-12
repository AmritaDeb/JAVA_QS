
/*
	    2
	  4*6
	8*2*4
  6*8*2*4
*/

class P4
{
	public static void main(String[] args) 
	{
		int n=4;
		int sp = (n-1) * 2;
		int k=2;
		for (int j=0; j<n; j++)
		{
			for (int i=0; i<sp; i++)
			{
				System.out.print(' ');
			}
			sp-=2;
			for (int i=0; i<j*2+1; i++)
			{
				if (i%2==1)
				{
					System.out.print('*');
				}
				else
				{
					if (k==10)
					{
						k=2;
					}
					System.out.print(k);
					k+=2;
				}

			}
			System.out.println();
		}
	}
}
