class Fruit 
{
	void taste() throws ClassNotFoundException
	{
		System.out.println("Fruit taste()");
		Class.forName("java.lang.Object");
	}
}
