
/*
WAP which can read a number from the user and obtain its digital sum [2548=2+5+4+8]
*/

class p12 
{
	public static void main(String[] args) 
	{
		int num = 1024;
		int d_sum = 0;
		while (num > 0)
		{
			int d = num % 10;
			d_sum += d;
			num /= 10;
		}
		System.out.println(d_sum);
	}
}
