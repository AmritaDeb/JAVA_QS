/*
	  A
	 BAB
	CBABC
   DCBABCD
*/

class P12
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0; i<n; i++)
		{
			char ch=(char)('A' +i);
			for (int j=0; j<n-i-1; j++)
			{
				System.out.print(' ');
			}
			for (int j=0; j<i*2+1; j++)
			{
				System.out.print(ch);
				if (j<(i*2+1)/2)
				{
					ch--;
				}
				else
				{
					ch++;
				}
			}
			System.out.println();
		}
	}
}