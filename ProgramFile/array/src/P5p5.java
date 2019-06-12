
//Copy elements from one array to another array

class P5p5 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30};
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		for (int i=0; i<a.length; i++)
		{
			b[i] = a[i];
		}
		System.out.println("Copied elements:");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Copied elements in reverse:");
		for (int j=a.length-1, i=0; i<a.length; i++,j--)
		{
			c[j] = a[i];
		}
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
