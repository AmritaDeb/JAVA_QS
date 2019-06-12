
/*count the digits of the given integer value*/

import java.util.Scanner;

class p6
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		int num = s.nextInt();       //5687
		/*
		int count=0;
		while (num>0)
		{
			num/=10;
			count++;
		}
		System.out.println("The length of the number:" + count);   //4
		*/
		
		int c;
		for (c=0; num>0; c++)
		{
			num/=10;
		}
		System.out.println("The length of the number:" + c);
		
	}
}


