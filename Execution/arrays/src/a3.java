
/*	Read a number from user and
	find the number is present in the array list repeatedly(more than 1) or not,
	given by user
*/

import java.util.Scanner;

class a3
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the array elements:");
		for (int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the number to check:");
		int num = s.nextInt();
		int count=0;
		for (int i=0; i<a.length; i++)
		{
			if (a[i] == num)
			{
				count++;
			}
		}
		if (count == 0)
		{
			System.out.println("The number is not present");
		}
		else if (count == 1)
		{
			System.out.println("The number is present once");
		}
		else if (count == 2)
		{
			System.out.println("The number is present twice");
		}
		else
		{
			System.out.println("The number is present more than twice");
		}
	}
}
