class p8
{
	static void test(int i)
	{
		System.out.println(i++);
		if(i==2)   
		{
			return;
		}
		test(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begin!");
		test(0);
		System.out.println("Main end!");
	}
}