
/* WAP to display the happy number  */

import java.util.Scanner;

class Happy
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int temp = num;
		int d_sum = 0;
		
		while (temp>9)
		{	
			d_sum=0;
			while (temp > 0)
			{
				int d = temp % 10;
				d_sum = d_sum + d*d;
				temp/=10;
			}
			temp = d_sum;
		}
		
		if (temp == 1 || temp == 7)
		{
			System.out.println("Its a happy number");
		}
		else
			System.out.println("Its a unhappy number");
		
	}
}


