class A
{
	int i=10;
}

class P1
{
	public static void main(String[] args) 
	{
		A ob1 = new A();
		A ob2 = new A();
		System.out.println(ob1.equals(ob2));  //false
	}
}
