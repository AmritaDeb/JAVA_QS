class A
{
	int i=10;

	public boolean equals(Object ob)
	{
		if(this.i==((A)ob).i)
			return true;
		return false;
	}
}

class P2
{
	public static void main(String[] args) 
	{
		A ob1 = new A();
		A ob2 = new A();
		System.out.println(ob1.equals(ob2));  //true
	}
}
