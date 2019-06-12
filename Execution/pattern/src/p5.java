
/*
	1 2 3
	4 5 6
	7 8 9
*/

class p5 
{
	public static void main(String[] args) 
	{
		int row = 3;
		int col = 3;
		int k = 1;

		for (int j=0; j<row; j++)
		{
			for (int i=0; i<col; i++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
