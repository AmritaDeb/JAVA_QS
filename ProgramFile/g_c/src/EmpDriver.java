
class Emp
{
	String name;
	int eid;
	Emp()
	{
	}
	Emp(String name, int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public void finalize()
	{
		System.out.println("The employee with:");
		System.out.println("eid:" + eid);
		System.out.println("name:" + name);
		System.out.println("is been cleared from memory");
	}
}
class EmpDriver
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("Sheela", 1);
		Emp e2 = new Emp("Leela", 1);
		e2 = new Emp("Laila",3);
		System.gc();
	}
}
