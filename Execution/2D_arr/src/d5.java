
// Read a number from user and display in 2D Array

import java.util.Scanner;

class d5
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the rows of A:");
		int row = s.nextInt();

		System.out.println("Enter the cols of A:");
		int col = s.nextInt();

		int[][] a = new int[row][col];

		System.out.println("Enter the elements of A:");
		
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("-------------------------");

		System.out.println("Enter the rows of B:");
		int row = s.nextInt();

		System.out.println("Enter the cols of B:");
		int col = s.nextInt();

		int[][] b = new int[row][col];

		System.out.println("Enter the elements of B:");
		
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				b[i][j]=s.nextInt();
			}
		}

		System.out.println("The matrix is..");

		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	
	}
}
