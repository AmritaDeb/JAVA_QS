class AA1
{
	AA1()
	{
		System.out.println("Parent class constructor invoked");         // (1) (4)
	}
}
class BB extends AA1
{
	BB()
	{
		super();
		System.out.println("Child class constructor invoked");      // (3)
	}
	BB(int a)
	{
		super();
		System.out.println("Child class constructor invoked int()");	// (6)
	}
	{
		System.out.println("IIB");   // (2)  (5)
	}
	public static void main(String[] args) 
	{
		BB ob = new BB();
		BB ob1 = new BB(10);
	}
}
