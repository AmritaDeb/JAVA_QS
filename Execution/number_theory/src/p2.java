
/*Read a number from the user, print the last digit of the number*/

import java.util.Scanner;

class p2 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		int num = s.nextInt();         //521
		System.out.println("The last digit of entered no is:");
		System.out.println(num % 10);       //1
	}
}
