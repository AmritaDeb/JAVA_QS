
// Display the array elements of characters in descending order

import java.util.Scanner;

class a16
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the array elements");
		String str = s.next();

		char[] a = str.toCharArray();
		System.out.println(a);


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
