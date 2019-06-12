
/* Display the sum of individual digit's factorials  [321=3!+2!+1!] */

class p23
{
	public static int fact(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		return num * fact(num-1);
	}
	static int digitCount(int num)
	{
		int counter = 0;
		while (num > 0)
		{
			num/=10;
			counter++;
		}
		return counter;
	}
	static int digitFactSum(int num)
	{
		int d_sum = 0;
		int d_count = digitCount(num);
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
		int num = 321;
		
		System.out.println("factorials:" + digitFactSum(num));
	}
}
