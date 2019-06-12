class Employee
{
	private static int c_id;
	int id;
	String name;
	double salary;
	
	void work()
	{
		System.out.println(this.name + " should work");
	}

	Employee()
	{
	
	}
	Employee(int id)
	{
		this.id=id;
	}
	Employee(int id, String name)
	{
		this(id);
		this.name=name;
	}
	Employee(int id, String name, double sal)
	{
		this(id,name);
		this.salary=sal;
	}

	public static int getId()
	{
		return c_id;
	}
	
	public static void setId(int id)
	{
		Employee.c_id=id;
	}
}

class EmployeeDriver
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.getId();
		Employee e2 = new Employee(1,"Amy",20000);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		e2.work();
		Employee.setId(10);
		System.out.println(Employee.getId());
	}
}
