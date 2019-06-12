class highest321 
{
	public static void main(String[] args) 
	{
		int a=20,b=10,c=30;
		//int highest=(((a>b ? a : b) > c) ? b : c);
		int highest1 = ((a>b && a>c) ? a : (b>c ? b : c));
		int highest2 = ((a>b && a>c) ? a : (b>c ? b : c));
		int highest3 = ((a>b && a>c) ? a : (b>c ? b : c));
		System.out.println("The highest1 no is:" + highest1);
		System.out.println("The highest2 no is:" + highest2);
		System.out.println("The highest3 no is:" + highest3);
	}
}
