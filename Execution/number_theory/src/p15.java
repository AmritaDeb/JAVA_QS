
/*
WAP to display x power n
*/

class p15
{
	public static void main(String[] args) 
	{
		int num, res;
		//num = res = 2;
		num = 2;
		res = 1;
		int pow = 4;
		for (int i=1; i<=pow; i++)
		{
			res*=num;
		} 
		System.out.println(num + "power" + pow + "is:" + res);
	}
}
