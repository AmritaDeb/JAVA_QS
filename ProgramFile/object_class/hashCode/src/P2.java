class A
{
	int i;

	A()
	{}
	A(int i)
	{
		this.i=i;
	}

	public int hashCode()
	{
		int hc=0;
		hc+=i;
		return hc;
	}
}

class P2
{
	public static void main(String[] args) 
	{
		A ob = new A(20);

		System.out.println(ob);
		System.out.println(ob.hashCode());
	}
}
   