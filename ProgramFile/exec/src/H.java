class H 
{
	static void test()
	{
		System.out.println("from test");
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a = 10;
		System.out.println(a);
		test();
	}
}
