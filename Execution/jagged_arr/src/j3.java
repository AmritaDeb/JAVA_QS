
/*
	jagged string array
*/

class j3
{
	public static void main(String[] args) 
	{
		String[] str = new String[3];
		str[0] = "Hello";
		str[1] = "Bye";
		str[2] = "GetLost";

		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
}
