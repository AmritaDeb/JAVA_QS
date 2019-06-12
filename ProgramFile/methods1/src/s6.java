
// print 100-1 if any number divisible by 3, print 0

class s6
{
	public static void test1(int n)
	{
		if (n==0)
		{
			test2(n);
		}
		else if (n%3==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(n);
		}
		test1(++n);
	}

	public static void test2(int n)
	{
		if (n==100)
		{
			return;
		}
		else if (n%3==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(n);
		}
		//test2(--n);
		return;
	}
	
	public static void main(String[] args) 
	{
		int n = 100;
		int k = 0;
		test1(n);
		test2(k);
	}
}