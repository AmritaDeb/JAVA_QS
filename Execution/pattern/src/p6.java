
/*
	1 2 3
	1 2 3
	1 2 3
*/

class p6 
{
	public static void main(String[] args) 
	{
		int row = 3;
		int col = 3;
		

		for (int j=0; j<row; j++)
		{
			int k = 1;
			for (int i=0; i<col; i++)
			{
				System.out.print(k++);
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
