package bmg;
import java.util.Scanner;

class BmgApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to book my game application");
		System.out.println("1. Badminton");
		System.out.println("2. TT");
		System.out.println("Enter your choice");
		int ch = s.nextInt();
		switch(ch)
		{
			case 1:
			{
				Bmg ob1 = new Bmg();
				double t_a=ob1.Badminton();
				System.out.println("1. to confirm");
				System.out.println("2. to exit");
				int ch1 =s.nextInt();
				if(ch1==1)
				{
					ob1.book();
				}
				else
				{
					System.out.println("Thank u!!");
					System.exit(0);
				}
			}
			case 2: System.out.println("still under construction");
			break;
			default: System.out.println("Wrong Choice");
		}
	}

}