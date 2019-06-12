
/* write a program which can read a number, 
it should display each digit in a new line, 
such that every alternative digit from 1st digit must be displayed as X.
*/


import java.util.Scanner;

class p10
{
	static Scanner s = new Scanner(System.in);

	static int count(int num)
	{	
		int count=0;
		while (num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{    
		System.out.println("Enter the number:");
		int num = s.nextInt();       //5687

		int[] a= new int [count(num)];
		System.out.println("The length of the number:" + a.length);
		int i=0;
		while (num>0)
		{
			a[i++]=num%10;
			num=num/10;
		}
		for (int j=a.length-1; j>=0; j--)
		{
			if (j%2==0)
			{
				System.out.println("*");
			}
			else
			{
			System.out.println(a[j]);
			}
		}
		System.out.println();
		for (int j = 0; j<a.length; j++)
		{
			if (j%2==0)
			{
				System.out.println(a[j]);
			}
			else
			{
				System.out.println("*");
			}
		}

	}
}