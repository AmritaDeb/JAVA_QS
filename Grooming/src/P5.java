
/*
        2
      4*6
    8*2*4
  6*8*2*4
*/

class P5 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=0; i<n; i++)
		{
			int k= i+1;
			for (int j=0; j<(n-i)*2-1; j++)
			{
				if (j%2==1)
				{
					System.out.print('*');
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
