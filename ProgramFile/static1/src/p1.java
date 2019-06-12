class  p1
{
	static void test()
	{
		System.out.println(i);
	}
	static
	{
		//System.out.println(i);
		//System.out.println(p1.i);
		test();
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("Main" + i);
		i=10;
		test();
	}
}
