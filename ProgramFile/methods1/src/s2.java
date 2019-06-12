
	//Print 0-50 by recursive logic

class s2
{
	static int count = 0;
	static void test1()
	{
		count++;
		if (count<=50)
		{
			System.out.println(count);
			test1();
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		test1();
		System.out.println("Main End");
	}
}