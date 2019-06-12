
class Reinitializing 
{
	public static void main(String[] args) 
	{
		A ob = new A(10);
		System.out.println(ob.i);
		ob = new A(20);
		System.gc();
		System.out.println(ob.i);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}
