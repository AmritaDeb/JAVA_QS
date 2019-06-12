
//Copy elements from one array to another array in reverse order

class P6
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40};
		int[] b = new int[a.length];

		for (int i=0,j=a.length-1; i<a.length; i++,j--)
		{
			b[j] = a[i];
		}

		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}
