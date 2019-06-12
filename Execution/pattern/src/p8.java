
/*
	1 2 3 4 5
	6 7 8 9 1
	2 3 4 5 6 
	7 8 9 1 2
*/

class p8
{
	public static void main(String[] args) 
	{
		int row = 4;
		int col = 5;
		int k = 1;
		
		for (int j=0; j<row; j++)
		{
			for (int i=1; i<=col; i++)
			{
				System.out.print(k++);
				if (k == 10)
				{
					k=1;
				}
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
