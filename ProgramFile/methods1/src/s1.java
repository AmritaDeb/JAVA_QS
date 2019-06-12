class s1
{
	static void test1(int i)
	{
		
		System.out.println("hello");
		i++;
		if(i==3)   
		{
			return;
		}
		test2(i);
		System.out.println("from test1()");
	}
	static void test2(int i)
	{
		System.out.println("bye");
		test1(i);
		System.out.println("from test2()");
	}
	public static void main(String[] args) 
	{
		System.out.println(1);
		test1(1);
		System.out.println(2);
	}
}