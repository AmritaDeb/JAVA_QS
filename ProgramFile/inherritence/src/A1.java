class A1
{
	int i;                                              // Non-static variable
	static int j;										// Static variable
	static void test()									// Static method
	{
		System.out.println("from A1.test()");
	}
	void test1()										// Non-static method
	{
		System.out.println("from A1.test1()");
	}
	public static void main(String[] args)				// Main method
	{
		System.out.println("from A1.main()");			
		A1 ob = new A1();
		ob.i=10;
		System.out.println(ob.i);
		j=20;
		A1.j=40;
		System.out.println(A1.j);
		test();
		A1.test();
		ob.test();
	//	A1.test1();   // 
		ob.test1();
	}
}
