class B
{
	public static void rec(int i)
	{
		if (i==12)
		{
			return;
		}
			i=i+2;
			rec(i);
			System.out.println(i);
	}
	public static void main(String[] args) 
	{
		int i=0;
		rec(i);
		System.out.println(i);
	}
}
