package pack1;
class C1
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
	private C2()
	{
		System.out.println("C()");
	}
}
class C2 extends C1
{
	public static void main(String[] args) 
	{
		System.out.println(j);
		test2();
		C2 ob1 = new C2();
		ob1.test1();
		System.out.println(ob1.i);
        
		/*A2 ob2 = new A2();
		ob2.test1();
		System.out.println(ob2.i);*/
	}
}
