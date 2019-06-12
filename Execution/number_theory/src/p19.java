
/*
WAP to display Armstrong number: [ 153 = (1*1*1)+(5*5*5)+(3*3*3)]
step1:find no of digit in the no
step2:extract a digit
step3:find power of digit with no of digit in the original no
step4:add the result to digit_sum
step5:repeat step2-step4 till number become 0
*/

class p19
{
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
	static int power(int base, int pow)
	{
		int res = 1;
		for (int i=1; i<=pow; i++)
		{
			res *= base;
		}
		return res;
	}
	static int digitPowerSum(int num)
	{
		int d_sum = 0;
		int d_count = digitCount(num);
		while (num > 0)
		{
			int d = num % 10;
			//d_sum = d_sum + d;   //if only the digit
			d_sum = d_sum + power(d, d_count);
			num/=10;
		}
		return d_sum;
	}
	public static void main(String[] args) 
	{
		int num = 370;
		int d_sum = digitPowerSum(num);
		
		if (num==d_sum)
		{
			System.out.println("This is a Armstrong Number");
		}
		else
			System.out.println("This is not a Armstrong Number");
	}
}
