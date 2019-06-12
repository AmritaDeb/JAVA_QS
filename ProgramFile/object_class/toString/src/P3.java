class A
{
	int i;
	float j;
	char l;
	double m;

	A()
	{
	}

	A(int ii, float jj, char ll, double mm)
	{
		this.i=ii;
		this.j=jj;
		this.l=ll;
		this.m=mm;
	}

	public String toString()
	{
		return i + "," + j + "," + l + "," + m;
	}
}

class P3
{
	public static void main(String[] args) 
	{
		A ob = new A();
		A ob1 = new A(10, 10.5f, 'a', 25.5);
		System.out.println(ob);
		System.out.println(ob1);
	}
}
