
/*	
	WAP to obtain the repeated element of an string array
*/


class a7
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter the size of the array:");
		//int size = s.nextInt();
		
		char [] a = "Apple".toCharArray();
		int freq = 0;

		int i,j;
		for (i=0; i<a.length; i++)
		{
			freq = 0;
			for (j=0; j<a.length; j++)
			{
				if (a[i] == a[j])
				{
					freq++;
				}
			}
			if (freq > 1)
			{
				System.out.println(a[i]);
			}
			
		}
	}
}
