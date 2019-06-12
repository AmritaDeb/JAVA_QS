class A 
{
	int x = 10;

	{
		System.out.println("A.non-static block");
	}

	public static void main(String[] args) 
	{
		A ob = new A();
		System.out.println(ob.x);
	}
}
