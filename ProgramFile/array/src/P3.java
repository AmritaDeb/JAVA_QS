
/* Print array elements in reverse order by taking user inputs */

import java.util.Scanner;

class P3
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array elements");
		for (int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The array elements in reverse order are:");
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}
}
