class Bike7
{
	int speed;                    // (1) speed=0

	Bike7()
	{
		System.out.println("Speed:" + speed);  
	}
	{
		speed=100;               // (2) speed=100
	}

	public static void main(String[] args) 
	{
		Bike7 b1=new Bike7();      // (3) Bike7()
		Bike7 b2=new Bike7();	   // (4) Bike7()
	}
}
