
//Print the character array elements and make the 1st character in uppercase and remaining will be in lowercase

class P10 
{
	public static void main(String[] args) 
	{
		char [] a = {'a', 'm', 'r', 'i', 't', 'a'};
		for (int i=0; i<a.length; i++)
		{
			if (i==0)
			{
				if (a[i]>='a' && a[i] <='z')
				{
					a[i] = (char)(a[i] - 32);
				}
			}
			else
			{
				if (a[i]>='A' && a[i]<='Z')
				{
					a[i] = (char)(a[i] + 32);
				}
			}
			System.out.print(a[i]);
		}
	}
}
