
// Display the array elements of characters in descending and ascending order by calling method

import java.util.Scanner;

class a17
{
	static Scanner s = new Scanner(System.in);

	static void arrAscending()
	{
	
	}
	
	static void arrDescending()
	{
	
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the array elements");
		String str = s.next();

		char[] a = str.toCharArray();
		System.out.println(a);

		System.out.println("1. Ascending");
		System.out.println("2. Descending");
		System.out.println("Enter your choice:");


		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] > a[j])
				{
					char temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
