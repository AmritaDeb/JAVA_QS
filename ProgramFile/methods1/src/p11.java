class p11
{
	static void test(int i)
	{
		System.out.println(i++);
		if(i==101)   
		{
			return;
		}
		test(i);
	}
	public static void main(String[] args) 
	{
		//System.out.println("Main begin!");
		test(0);
		//System.out.println("Main end!");
	}
}

/*  
To print 0 to 100 using recursive logic
*/