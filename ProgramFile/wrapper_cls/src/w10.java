
// String to integer

class w10 
{
	public static void main(String[] args) 
	{
		String s1[] = {"10a","20"};
		int a[] = new int[s1.length];
		for (int i=0; i<a.length; i++)
		{
			try
			{
				a[i] = Integer.parseInt(s1[i]);
			}
			catch (NumberFormatException e)
			{
				System.out.println(a);
				System.out.println("Not a proper no:");
			}
			System.out.println(a[i]);
		}
	}
}
