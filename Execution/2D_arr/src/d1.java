
/*
	2D Array 
	10 10 10 
	10 10 10 
	10 10 10 
*/ 

class d1
{
	public static void main(String[] args) 
	{
		int[][] a = new int[3][3];
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				a[i][j]=10;
			}
		}

		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}
}
