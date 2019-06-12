package pack1;
private class B
{
	int i;
	static int j;
	void test1()
	{
		System.out.println("test1()");
	}
	static void test2()
	{
		System.out.println("test2()");
	}
	public static void main(String[] args) 
	{
		System.out.println(j);
		test2();
		B ob1 = new B();
		ob1.test1();
		System.out.println(ob1.i);
        
		/*A2 ob2 = new A2();
		ob2.test1();
		System.out.println(ob2.i);*/
	}
}
