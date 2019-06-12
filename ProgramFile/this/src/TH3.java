
//The this keyword can also be passed as an argument in the method.

class TH3 
{
	void m(TH3 ob)
	{
		System.out.println(ob);
	}
	void p()
	{
		m(this);
	}
	public static void main(String[] args) 
	{
		TH3 s = new TH3();
		System.out.println(s);
		s.p();
	}
}
