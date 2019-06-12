
/*
To display string to char array by using toCharArray()
Returntype => char[]
*/

class ToCharArray
{
	public static void main(String[] args) 
	{
		char[] a = "apple".toCharArray();
		System.out.println(a);
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		} 

		String s1 = "hello";
		System.out.println(s1);
		char[] b = s1.toCharArray();
		System.out.println(b);

		System.out.println("Mango".toCharArray());    //optimized
	}
}
