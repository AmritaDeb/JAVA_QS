
/*	
	WAP to search duplicate values of an array
	WAP to obtain frequency of occurance of every element of array
*/

import java.util.Scanner;

class a4
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

		//System.out.println("Enter the number to check:");
		//int num = s.nextInt();
		boolean flag = false;
		int temp=a[0];
		for (int i=1; i<a.length; i++)
		{
			
			//temp=a[i];
			if (temp == a[i])
			{
				System.out.println("The number " +a[i] + " is duplicate");
				//break;
			}
			else
			{
				System.out.println("The number " + a[i] + " is not duplicate");
			}
		}
	}
}
