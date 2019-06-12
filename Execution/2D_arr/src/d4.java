
/*
	5 * 7
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
*/

class d4 
{
	public static void main(String[] args) 
	{
		int [][] a = new int[5][7];
		System.out.println(a.length);
		System.out.println(a[0].length);
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
