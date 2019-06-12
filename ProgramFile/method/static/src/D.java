class D
{
	static int x;

	static
	{
		System.out.println("A.static block");
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(D.x);
	}
}
