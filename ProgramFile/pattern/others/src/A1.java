class A1 
{
	public static void main(String[] args) 
	{
		int n=3;
		int k=5;
		for (int row=0; row<n; row++)
		{
			for (int col=0; col<k; col++)
			{
				if (row==0 && col!=0 && col!=n/2 || 
					row==n/2 && col!=0 && col!=k/2 ||
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
