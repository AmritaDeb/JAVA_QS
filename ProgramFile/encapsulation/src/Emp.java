class Emp
{
	int id;
	String name;
	double salary;
	
	void work()
	{
		System.out.println(this.name + " should work");
	}

	Emp(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.salary=sal;
	}

	public static void main(String[] args) 
	{
		Emp e = new Emp(1,"Amy",20000);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);

		e.work();
	}
}
