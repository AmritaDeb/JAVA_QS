class  p2
{
	static int i=test1() + test2();
	public static int test1()
	{
		System.out.println("Inside test1:" + i);
		i=1;
		return i+test2();
	}
	public static int test2()
	{
		System.out.println("test2:" + i);
		i=2;
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main i:" + i);
	}
}
