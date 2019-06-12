class s3
{
	public static void test1(int n)
	{
		if (n==50)
		{
			return;
		}
		else if (n%2==0)
		{
			System.out.println(n);
		}
		test1(++n);
	}
	
	public static void main(String[] args) 
	{
		int n = 2;
		test1(n);
	}
}