
/*
WAP to display count the number in method
*/

class p17
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
	public static void main(String[] args) 
	{
		System.out.println(digitCount(8));   //1
		System.out.println(digitCount(124));    //3
	}
}
