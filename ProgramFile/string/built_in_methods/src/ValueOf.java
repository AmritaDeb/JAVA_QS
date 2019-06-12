
/*
	To convert char[], int type, double type, boolean type into a string by using String.valueOf() 
	Returntype => string
*/

class ValueOf 
{
	public static void main(String[] args) 
	{
		char[] a = "Hello".toCharArray();
		String b = String.valueOf(a);
		System.out.println(b);

		int a1 = 100;
		String b1 = String.valueOf(a1);
		System.out.println(b1);

		double a2 = 100.29;
		String b2 = String.valueOf(a2);
		System.out.println(a2);

		boolean a3 = false;
		String b3 = String.valueOf(a3);
		System.out.println(b3);

		System.out.println(String.valueOf("Mango"));     //optimized
	}
}
