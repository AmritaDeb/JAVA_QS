class E
{
	int x = 10;

	{
		System.out.println("D.non-static block");
	}

	void B()
	{
		System.out.println("D.non-static method");
	}

	E()
	{
		System.out.println("D.constructor");
	}

	E(int i, String j)
	{
		System.out.println("D.constructor");
	}

	public static void main(String[] args) 
	{
		E ob = new E();
		E ob1 = new E(10, "amy");
		System.out.println(ob.x);

		ob.B();
	}
}
