class B 
{
	int count;
	B(int count)
	{
		count++;
	}
	/*
	{
		count++;
	}*/
	public static void main(String[] args) 
	{
		B ob1 = new B(1);
		B ob2 = new B(2);
		B ob3 = new B(3);
		B ob4 = new B(4);
		System.out.println("No of Objects:" + B.count);
	}
}
