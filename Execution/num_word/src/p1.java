
//num to word 0-99

class p1 
{

	static String[] one = {"","one","two","three","four","five","six","seven","eight","nine","ten",
							"eleven","tweleve","thirteen","forteen","fivteen","sixteen","seventeen","eighteen","nineteen"};

	static String[] two = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};

	static String display(int n)
	{
		String word = "";
		if (n==0)
		{
			return "zero";
		}
		else if (n<20)
		{
			word = one[n%20];
			return word;
		}
		else
		{
			word = two[n/10] + "" + one[n%10];
			return word;
		}
	}
	public static void main(String[] args) 
	{
		int n = 9;
		System.out.println(display(n));
		int n1 = 19;
		System.out.println(display(n1));
		int n2 = 29;
		System.out.println(display(n2));
		int n3 = 49;
		System.out.println(display(n3));
		int n4 = 99;
		System.out.println(display(99));
	}
}
