class E
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int row=0; row<n; row++)
		{
			for (int col=0; col<=n/2; col++)
			{
				if (row==0 ||
					col==0 ||
					row==n/2 && col!=n/2 ||
					row==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}
