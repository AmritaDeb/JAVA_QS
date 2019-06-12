
/*Read input from user and obtain sum of all the elements of an array*/

import java.util.Scanner;

class P4
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
		System.out.println("The sum of the array elements are:");
		int result = 0;
		for (int i=0; i<a.length; i++)
		{
			result+=a[i];
		}
		System.out.println(result);
	}
}
