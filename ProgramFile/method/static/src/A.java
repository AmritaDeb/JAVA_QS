class A 
{
	static int x;

	static
	{
		System.out.println("A.static block");
	}

	static void A()
	{
		System.out.println("A.static method");
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(A.x);

		A();
	}
}
