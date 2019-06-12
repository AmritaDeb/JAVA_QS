
/*	
	WAP to search duplicate values of an array
	WAP to obtain frequency of occurance of every element of array
*/


class a5
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter the size of the array:");
		//int size = s.nextInt();
		int [] a = {10,20,10,40};
		int freq = 0;

		for (int i=0; i<a.length; i++)
		{
			freq = 0;
			for (int j=0; j<a.length; j++)
			{
				if (a[i] == a[j])
				{
					freq++;
				}
			}
			System.out.println(a[i] + " occurs " + freq + " times");
		}
	}
}
