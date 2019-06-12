
/*
	Q
	QS
	QSP
	QSPI
	QSPID
	QSPIDE
	QSPIDER
	QSPIDERS
*/

class P7
{
	public static void main(String[] args) 
	{
		String s1="QSPIDERS";
		int n=s1.length();
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(s1.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
