
/* A method to obtain nth factorial */

class p21
{
	public static int fact(int num)
	{
		int f=1;
		for (int i=1; i<=num; i++)
		{
			f=f*i;
		}
		return f;
	}
	public static int fact_rec(int num)
	{
		if (num == 1)
		{
			return 1;
		}		
		//return num * fact_rec(num-1);
		return num * fact_rec(--num);
	}
	public static void main(String[] args) 
	{		
		System.out.println("factorials:" + fact(6));
		System.out.println("factorials:" + fact_rec(5));
	}
}
