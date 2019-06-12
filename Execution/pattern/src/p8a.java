
/*
	1 2 3 4 5
	6 7 8 9 1
	2 3 4 5 6 
	7 8 9 1 2
*/

class p8a
{
	public static void main(String[] args) 
	{
		int row = 4;
		int col = 5;
		int k = 0;
		
		for (int j=0; j<row; j++)
		{
			for (int i=1; i<=col; i++)
			{
				System.out.print((k++%9)+1);
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
