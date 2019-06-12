class E
{
	static int x;

	static
	{
		System.out.println("A.static block");
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		x= 20;
		System.out.println(E.x);
	}
}
