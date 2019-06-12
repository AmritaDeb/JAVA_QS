
	//Remove extra space between words

import java.util.Scanner;

class a9 
{
	public static void main(String[] args) 
	{
		int lw = 0, sc = 0;
		str = "";
		for (int i=0; i<ch.length; i++)
		{
			while (i<ch.length && ch[i] != ' ')
			{
				lw++;
				str = str + ch[i];
				i++;
			}
			str = str + ' ';
			while (i<ch.length && ch[i] == ' ')
			{
				sc++;
				i++;
			}
			i--;
		}
		System.out.println(str);
	}
}
