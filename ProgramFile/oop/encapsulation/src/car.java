class car
{
	private int id;
	String name;
	double price;

	car()
	{
		
	}
	car(int id)
	{
		this.id=id;
	}
	car(int id, String name)
	{
		this(id);
		this.name=name;
	}
	car(int id, String name, double price)
	{
		this(id, name);
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
}

class carDriver
{
	public static void main(String[] args) 
	{
		//car ob1=new car();
		//ob1.getId();
		car ob1=new car(10,"abc",10000);
		System.out.println(ob1.name);
		System.out.println(ob1.price);
		System.out.println(ob1.getId());
		//ob2.ename="dinga";
		//ob2.sal=2000;
		//ob2.eid=102;
	}
}

	

