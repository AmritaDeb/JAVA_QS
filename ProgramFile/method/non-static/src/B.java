class B
{
	int x = 10;

	{
		System.out.println("B.non-static block");
	}

	void B()
	{
		System.out.println("B.non-static method");
	}

	public static void main(String[] args) 
	{
		B ob = new B();
		System.out.println(ob.x);

		ob.B();
	}
}
