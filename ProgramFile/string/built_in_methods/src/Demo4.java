
/*
	WAP to read a sentence from user and
	count the number of words begin with vowel and
	the number of words begin with consonants
*/

import java.util.Scanner;

class Demo4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Say something:");
		String s1 = s.nextLine();
		s1 = s1.toLowerCase();

		String [] s2 = s1.split(" ");
		int len = s2.length;
		System.out.println("No of words:" + len);

		int vowel, consonant;
		vowel = consonant = 0;
		for (int i=0; i<len; i++)
		{
			char ch = s2[i].charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		System.out.println("vowel  :  " + vowel + "  consonant  :  " + consonant);
	}
}
