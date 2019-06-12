class A
{
	int i=10;
	public String toString()
	{
		return " Value:" + i;
	}
}

class P2
{
	public static void main(String[] args) 
	{
		A ob = new A();
		System.out.println(ob);
	}
}
