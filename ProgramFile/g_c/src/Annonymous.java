
class Annonymous 
{
	public static void main(String[] args) 
	{
		System.out.println((new A(20).i));
		System.gc();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}
