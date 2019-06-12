class A
{
	static int count;
	{
		count++;
	}
	public static void main(String[] args) 
	{
		A ob = new A();
		System.out.println(count);
	}
}
