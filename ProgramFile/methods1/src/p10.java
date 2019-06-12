class p10
{
	static void test(int i)
	{
		i++;
		System.out.println(i);
		if(i==5)   
		{
			return;
		}
		test(i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begin!");
		test(0);
		System.out.println("Main end!");
	}
}