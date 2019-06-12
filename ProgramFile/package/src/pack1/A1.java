package pack1;
class A1
{
	private int i;
	private int j;
	private void test1()
	{
		System.out.println("test1");
	}
	private static void test2()
	{
		System.out.println("test2");
	}
	public static void main(String[] args) 
	{
		//System.out.println(j);
		test2();
		A1 ob1 = new A1();
		ob1.test1();
		System.out.println(ob1.i);
	}
}
