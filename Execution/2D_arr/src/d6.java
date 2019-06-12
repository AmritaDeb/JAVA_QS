
// Read a number from user and display in 2D Array

import java.util.Scanner;

class d6
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the order of 1st matrix:");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		System.out.println(r1);
		System.out.println(c1);

		System.out.println("Enter the order of 2nd matrix:");
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		System.out.println(r2);
		System.out.println(c2);

		if (r1==r2 && c1==c2)
		{
			int[][] a = new int[r1][c1];
			int[][] b = new int[r2][c2];
			int[][] c = new int[r1][c1];

			System.out.println("Enter the elements of 1st matrix:");
			for (int i=0; i<r1; i++)
			{
				for (int j=0; j<c1; j++)
				{
					a[i][j] = s.nextInt();
				}
			}

			System.out.println("Enter the elements of 2nd matrix:");
			for (int i=0; i<r1; i++)
			{
				for (int j=0; j<c1; j++)
				{
					b[i][j] = s.nextInt();
				}
			}

			//Addition

			System.out.println("The result matrix:");
			for (int i=0; i<r1; i++)
			{
				for (int j=0; j<c1; j++)
				{
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				System.out.println();
			}

		}
		else
		{
			System.out.println("The oreder of A and B should be same");
		}	
	}
}
