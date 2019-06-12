/*
	To concatinate two strings, use concat()
	Returntype => string
*/

class Concat 
{
	public static void main(String[] args) 
	{
		String s1 = "good";
		String s2 = s1.concat("girl");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("Mango".concat(" taste is:").concat(" sweet"));
	}
}
