class K 
{
	static void test(int i)
	{
		System.out.println(i++);
		if (i==2)
		{
			return;
		}
		test(i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main()");
		test(0);
	}
}
