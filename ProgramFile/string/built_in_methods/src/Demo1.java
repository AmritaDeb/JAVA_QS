
/*
	WAP to display to read a string from a user, if the first character is:"I", display message : "Hello"
*/

import java.util.Scanner;

class Demo1
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		String str = s.next();
		if (str.toUpperCase().indexOf("I")==0)
		{
			System.out.println("Hello");
		}
	}
}
