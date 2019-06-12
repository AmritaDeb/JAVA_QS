class a1 
{
	public static void test1(int n)
	{
		if (n%2==0)
		{
			return;
		}
		test1(n);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n = 50;
		test1(n);
	}
}
