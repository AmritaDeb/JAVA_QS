class  A
{
	 private static int a;

	 public static void set_a(int a)
	{
		 A.a=a;
	}

	public static int get_a()
	{
		return a;
	}
}
class B
{
	public static void main(String [] args)
	{
		A.set_a(10);
		System.out.println(A.get_a());
	}
}
