
/*
	To break a string into a multiple string
	Returntype => array of string / string[]
*/

class Split
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome to Bangalore";
		String [] s2 = s1.split("");
		String [] s2 = s1.split(" ");
		System.out.println("No of words:");
		System.out.println(s2.length);
		int len = s2.length;
		for (int i=0; i<len; i++)
		{
			System.out.println(s2[i]);
		}
	}
}
