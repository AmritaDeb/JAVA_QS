
	//Remove extra space between words

import java.util.Scanner;

class a10
{
	public static void main(String[] args) 
	{
		String s1 = "Hello   Kolkata";

		char[] ch = s1.toCharArray();
		int wb = 0;
		int we = 0;
		int lw = 0;

		String s2 = "";
		for (int i=0; i<ch.length; i++)
		{
			lw=0;
			wb=i;
			while (i<ch.length && ch[i] != ' ')
			{
				lw++;
				i++;
			}
			we = i-1;
			while (we >= wb)
			{
				s2 = s2 + ch[we--];
			}
			if (i<ch.length-1 && lw>0)
			{
				s2 += ' ';
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length() == s2.length());
	}
}
