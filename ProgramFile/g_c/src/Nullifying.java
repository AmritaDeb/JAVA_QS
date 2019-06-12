
class Nullifying 
{
	public static void main(String[] args) 
	{
		A ob = new A(10);
		System.out.println(ob.i);
		ob = null;
		System.gc();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}
