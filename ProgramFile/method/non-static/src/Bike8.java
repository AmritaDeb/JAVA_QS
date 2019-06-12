class Bike8
{
	int speed;                    // (1) speed=0

	Bike8()
	{
		System.out.println("Speed:" + speed);  
	}

	{
		speed=150;               // (2) speed=150
	}

	public static void main(String[] args) 
	{
		Bike8 b1=new Bike8();      // (3) Bike7()
		//Bike7 b2=new Bike7();	   // (4) Bike7()
	}
}
