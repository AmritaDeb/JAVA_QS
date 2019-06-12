
//NonPremitive array

class Emp
{
	int eid;
	String name;
	double sal;

	void work(String name)
	{
		System.out.println("Working..!!");
	}

	Emp()
	{
	}

	Emp(int eid, String name, double sal)
	{
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
}

class EmpDriver
{
	public static void main(String[] args) 
	{
		Emp[] e;
		e = new Emp[3];
		e[0] = new Emp(1,"a",1000);
		e[1] = new Emp(2,"b",2000);
		e[2] = new Emp(3,"c",3000);
	
		for (int i=0; i<e.length; i++)
		{
			System.out.println("eid:" + e[i].eid);
			System.out.println("name:" + e[i].name);
			System.out.println("sal:" + e[i].sal);
			e[i].work(e[i].name);
			System.out.println("--------------------");
		}

		
	}
}
