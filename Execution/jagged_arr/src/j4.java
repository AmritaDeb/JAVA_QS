
/*
	string array to char array
*/

class j4
{
	public static void main(String[] args) 
	{
		String[] str = new String[3];
		str[0] = "hello";
		str[1] = "bye";
		str[2] = "getLost";

		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		char[][] ch =new char[str.length][];

		for (int i=0; i<str.length; i++)
		{
			ch[i] = str[i].toCharArray();
		}
		for (int i=0; i< ch.length; i++)
		{
			for (int j =0; j<ch[i].length; j++)
			{
				System.out.print(ch[i][j] + ",");
			}
			System.out.println();
		}
	}
}
