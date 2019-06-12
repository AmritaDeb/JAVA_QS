class Bike extends TwoWeeler 
{
	String name ; 
	float mileage ;
	int top_speed ; 
	Bike()
	{
	}
	Bike(String name , float mileage , int top_speed)
	{
		this.name = name ;
		this.mileage = mileage ;
		this.top_speed = top_speed ;
	}
	void move()
	{
		System.out.println("the bike moves smoothly till "+top_speed+"kmph");
	}
	void trip(String loc)
	{
		System.out.println("going to " + loc + " with my gf/bf") ;
	}
	public String toString()
	{
		return "name: "+ name+" ,mileage: "+mileage +" ,top_speed: "+top_speed+" ,"+super.toString();
	}

	public boolean equals(Object mangi)
	{
		Bike b = (Bike)mangi ;
		
		return super.equals(mangi) && name.equals(b.name) && mileage == b.mileage && top_speed == b.top_speed ;
	}

	public int hashCode()
	{
		int hc = 0 ;
		hc += name.hashCode() ;
		hc += (int)mileage ;
		hc += top_speed ;
		return super.hashCode() + hc ;
	}
}






