
/* Print array elements by taking user inputs */

import java.util.Scanner;

class P2
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
		System.out.println("The array elements entered are:");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
