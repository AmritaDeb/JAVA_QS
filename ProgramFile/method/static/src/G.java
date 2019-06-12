class G
{
	static int x = 10;

	static
	{
		System.out.println("G.static block");
	}

	static void G()
	{
		System.out.println("G.static method");
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		x= 20;
		System.out.println(G.x);

		G();
	}
}
