class w4
{
	static void test(Integer a)
	{
		System.out.println("Integer");
	}
	static void test(int a)
	{
		System.out.println("integer");
	}
	public static void main(String[] args) 
	{
		int a = 10;
		test(a);
	}
}
