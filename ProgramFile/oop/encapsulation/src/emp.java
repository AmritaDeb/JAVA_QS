class emp
{
	private int eid;
	String ename;
	double sal;

	emp()
	{
		
	}
	emp(int eid)
	{
		this.eid=eid;
	}
	emp(int eid, String ename)
	{
		this(eid);
		this.ename=ename;
	}
	emp(int eid, String ename, double sal)
	{
		this(eid, ename);
		this.sal=sal;
	}
	public int getEid()
	{
		return eid;
	}
}

class empDriver
{
	public static void main(String[] args) 
	{
		emp ob1=new emp();
		ob1.getEid();
		emp ob2=new emp(101,"dinga",10000);
		System.out.println(ob2.ename);
		System.out.println(ob2.sal);
		System.out.println(ob2.getEid());
		ob2.ename="dinga";
		ob2.sal=2000;
		//ob2.eid=102;
	}
}

	

