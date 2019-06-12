/*
	there was a girl called leela, she had 200rs with her, her friend wanted an ice cream whose cost is 125, leela buys the ice cream, 
	what is the amount left with leela 	
	*/ 

class L 
{
	public static void main(String[] args) 
	{
		int amnt=200;
		System.out.println("the amount leela has before getting an ice cream :" + amnt);

		int c_ice=125;
		System.out.println("the cost of the ice cream :" + c_ice);

		amnt = amnt - c_ice;
		System.out.println("the amount left with leela is :" + amnt);
	
	}
}
