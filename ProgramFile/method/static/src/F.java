class F
{
	static int x = 10;

	static
	{
		System.out.println("F.static block");
	}

	static void F()
	{
		System.out.println("F.static method");
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(F.x);

		F();
	}
}
