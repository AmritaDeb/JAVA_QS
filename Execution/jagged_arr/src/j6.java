
/*
	Welcome to Bangalore = emocleW ot erolagnaB
*/

class j6
{
	public static void main(String[] args) 
	{
		String str1 = "Welcome to Bangalore";
			//array of strings
		String[] str = str1.split(" ");			

		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}

		//string array to 2D jagged char array

		char[][] ch =new char[str.length][];
		for (int i=0; i<str.length; i++)
		{
			ch[i] = str[i].toCharArray();
		}
		System.out.println("-------------------");
		//generate the sentence
		String str2 = " ";
		for (int i=0; i< ch.length; i++)
		{	//every word is reversed
			for (int j =ch[i].length-1; j>=0; j--)
			{
				str2 += ch[i][j];
			}
			//after every word a space
			str2 += ' ';
		}
		System.out.println(str2);
	}
}
