
/*
	To check the char sequence present in a string or not by using contains()
	Returntype => boolean
*/

class Contains
{
	public static void main(String[] args) 
	{
		String s1 = "Apple";
		System.out.println(s1.contains("A"));
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains("pp"));
		System.out.println(s1.contains("pe"));
		System.out.println(s1.contains("b"));
	}
}
