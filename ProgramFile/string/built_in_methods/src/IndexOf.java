
/*
	To check wheather a character or a sub-string present in a string by using indexOf()
	--->indexOf(char)
	--->indexOf(string)
	--->indexOf(char,int)
	--->indexOf(string,int)
	Returntype => integer
*/

class IndexOf
{
	public static void main(String[] args) 
	{
		String s1 = "apple";
		System.out.println(s1.indexOf("p"));
		System.out.println(s1.indexOf("pl"));
		System.out.println(s1.indexOf("Pl"));
		System.out.println(s1.indexOf("p",1));
		System.out.println(s1.indexOf("p",2));
		System.out.println(s1.indexOf("e",2));
		System.out.println(s1.indexOf("E",2));

		System.out.println("Qspiders".indexOf('s',1));          //optimized
		System.out.println("Qspiders".indexOf("s",2));          //optimized
	}
}
