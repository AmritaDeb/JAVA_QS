
class A 
{
	int i;
	A()
	{
	}
	A(int i)
	{
		this.i=i;
	}
	public void finalize()
	{
		System.out.println("I'm gonna die!!! :(");
	}
}
