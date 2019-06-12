
/*Design a method to check wheather the enter number is a palindrome*/

class Palindrome
{
	static boolean isPalndrome(int num)
	{
		int rev=0;
		while (num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		return num==rev;
	}
	public static void main(String[] args) 
	{
		int n = 3993;
		if (isPalndrome(n))
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
}


