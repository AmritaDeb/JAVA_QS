
// print 100-1 if any number divisible by 3, print 0

class s5
{
	public static void test1(int n)
	{
		if (n==50)
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
		test1(++n);
	}
	
	public static void main(String[] args) 
	{
		int n = 1;
		test1(n);
	}
}