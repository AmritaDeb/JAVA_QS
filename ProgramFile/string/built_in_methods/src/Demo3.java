
/*
	WAP to read a sentence from user and
	display the number of words of length less than 5 and 
	number of words more than or equal to 5
*/

import java.util.Scanner;

class Demo3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Say something:");
		String s1 = s.nextLine();
		//String [] s2 = s1.split("");
		String [] s2 = s1.split(" ");
		int len = s2.length;
		System.out.println("No of words:" + len);
		int c1, c2;
		c1 = c2 = 0;
		for (int i=0; i<len; i++)
		{
			if (s2[i].length()<5)
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
		System.out.println("<5  :  " + c1 + "  >=5  :  " + c2);
	}
}
