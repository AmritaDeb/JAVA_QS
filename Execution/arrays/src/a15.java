
// Display the array elements of integer in descending order

class a15
{
	public static void main(String[] args) 
	{
		int [] a = {10,80,85,200};
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] < a[j])
				{
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
