class C extends A 
{
	int l;
	static int m;
	static
	{
		System.out.println("from C.SIB");
	}
	C()
	{
		System.out.println("from C()");
	}
	{
		System.out.println("from C.IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println(m);
		System.out.println(j);
		C ob = new C();
		System.out.println(ob.l);
	}
}
