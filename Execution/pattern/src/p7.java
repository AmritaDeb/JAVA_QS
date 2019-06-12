
/*
	1 0 3
	1 0 3
	1 0 3
*/

class p7 
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
				if (i==1)
				{
					System.out.print("0");
				}
				else
				System.out.print(i+1);
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
