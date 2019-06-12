
/*Read a number from the user, print third last digit:
*/

import java.util.Scanner;

class p5
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		System.out.println("Enter the number:");
		int num = s.nextInt();         //521
		for (int i=1; i<3; i++)
		{
			num/=10;
		}
		System.out.println("The last digit of entered no is:" + num % 10);
	}
}
