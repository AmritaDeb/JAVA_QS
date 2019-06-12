
/*
	J
	JA
	JAV
	JAVA
*/

class P6 
{
	public static void main(String[] args) 
	{
		String s1="JAVA";
		int n=4;
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
