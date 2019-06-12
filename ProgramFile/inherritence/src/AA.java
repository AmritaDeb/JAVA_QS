class AA
{
	AA()
	{
		System.out.println("Parent class constructor invoked");
	}
}
class B2 extends AA
{
	B2()
	{
		super();
		System.out.println("Child class constructor invoked");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B2 ob = new B2();
	}
}
