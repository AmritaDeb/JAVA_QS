class D
{
	int x = 10;

	{
		System.out.println("D.non-static block");
	}

	void B()
	{
		System.out.println("D.non-static method");
	}

	D()
	{
		System.out.println("D.constructor");
	}

	public static void main(String[] args) 
	{
		D ob = new D();
		System.out.println(ob.x);

		ob.B();
	}
}
