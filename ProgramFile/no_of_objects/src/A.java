class A 
{
	static int count;
	
	A()
	{
		count++;
	}
	
	/*
	{
		count++;
	}
	*/
	public static void main(String[] args) 
	{
		A ob1 = new A();
		A ob2 = new A();
		A ob3 = new A();
		A ob4 = new A();
		System.out.println("No of Objects:" + count);
	}
}
