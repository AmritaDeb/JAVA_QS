class  A
{
	int i,j;
	public void add()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	int l,k;
	public void sub()
	{
		System.out.println("Hello");
	}
}
class C
{
	public static void main(String[] args) 
	{
		//B b1= (B) new A();
		A a1 = new A();
		if (a1 instanceof B)
		{
			B b1 = (B) a1;
		}
		
	}
}
