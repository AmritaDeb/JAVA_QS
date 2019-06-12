class A
{
	int i=0;
}

class P1
{
	public static void main(String[] args) 
	{
		A ob = new A();
		System.out.println(ob.hashCode());
	}
}
   