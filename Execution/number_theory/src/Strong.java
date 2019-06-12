
/* WAP to display the strong number [145 (1! + 4! + 5! = 145)] */

class Strong
{
	public static int fact(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		return num * fact(--num);
	}
	
	static int digitFactSum(int num)
	{
		int d_sum = 0;
		//int d_count = digitCount(num);
		while (num > 0)
		{
			int d = num % 10;
			d_sum = d_sum + fact(d);
			num/=10;
		}
		return d_sum;
	}
	public static void main(String[] args) 
	{		
		int num = 145;
		int d_sum = digitFactSum(num);
		System.out.println("factorials:" + d_sum);
		if (num == d_sum)
		{
			System.out.println("Its a strong number");
		}
		else
			System.out.println("Its not a strong number");
	}
}
