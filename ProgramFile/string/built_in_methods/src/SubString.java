
/*
	To display sub strings by using substring()
	--->substring(int)  [inclusive]
	--->substring(int,int)  [exclusive]
	Returntype => string
*/

class SubString 
{
	public static void main(String[] args) 
	{
		String s1 = "MANGO";
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(3));
		//System.out.println(s1.substring(6));    // index is greater than s1.length()
		System.out.println("-------------");

		String s2 = s1.substring(s1.length());
		System.out.println(s2.isEmpty());
		System.out.println("-------------");

		System.out.println(s1.substring(0,2));
		System.out.println("-------------");
	}
}
