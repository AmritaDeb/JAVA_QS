class Emp 
{
	int eid;
	char ename;
	double salary;

	Emp()
	{

	}
	Emp(int eid, char ename, double sale)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}

	void work()
	{
		System.out.println("Emp is working");
	}
}
class Dev extends Emp
{
	void work()
	{
		System.out.println("dev.working");
	}
}
class Test extends Emp
{
	void work()
	{
		System.out.println("test.working");
	}
}
class JrDev extends Dev
{
	
}
class SrDev extends Dev
{
	
}
class ATe extends Test
{

}
class MTe extends Test
{
	
}
class EmpDriver
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		JrDev j = new JrDev();
		j.work();

		SrDev s = new SrDev();
		s.work();

		Dev d = new Dev();
		d.work();

		Test t = new Test();
		t.work();

		ATe a = new ATe();
		a.work();

		MTe m = new MTe();
		m.work();
	}
}
