class I 
{
	static void test(int i)
	{
		i++;
		System.out.println(i);
		if (i==3)
		{
			return;
		}
		test(i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin()");
		test(0);
		System.out.println("Main End()");
	}
}
