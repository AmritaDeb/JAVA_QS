
/*Read a number from the user, print second last digit:
*/

import java.util.Scanner;

class p4
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		System.out.println("Enter the number:");
		int num = s.nextInt();         //521

		/* Type-1
		System.out.println("The second last digit of entered no is:");
		int rem = num % 100;			//21
		System.out.println(rem / 10);       
		*/

		/*Type-2*/
		for (int i=1; i<2; i++)      
		{
			num/=10;
		}
		System.out.println("The second last digit of entered no is:" + num % 10);
	}
}


//if we want 2nd last (n), then we need to compare with n-1