
class B
{
	static int i=10;
	int j;
	double k;
	B()
	{
		j=20;
		k=30.0;
	}
	B(int j, double k)
	{
		this.j=j;
		this.k=k;
	}
	public boolean equals(Object ob)
	{
		return (i==((B)ob).i && j==((B)ob).j && k==((B)ob).k);
	}
}

class P3
{
	public static void main(String[] args) 
	{
		B ob1 = new B();
		System.out.println("------------------------------");
		System.out.println("State of object ob1:");
		System.out.println("i:" + ob1.i);
		System.out.println("j:" + ob1.j);
		System.out.println("------------------------------");

		B ob2 = new B();
		System.out.println("------------------------------");
		System.out.println("State of object ob2:");
		System.out.println("i:" + ob1.i);
		System.out.println("j:" + ob1.j);
		System.out.println("k:" + ob1.k);
		System.out.println("------------------------------");

		System.out.println(ob1.equals(ob2));
	}
}
