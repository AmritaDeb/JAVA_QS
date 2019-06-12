class p9
{
	static void test(int i)
	{
		i++;
		//System.out.println(i++);
		if(i==2)   
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