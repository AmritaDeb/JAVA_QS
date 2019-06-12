class highest4 
{
	public static void main(String[] args) 
	{
		int a=20,b=40,c=30,d=10;
		//int highest=(((a>b ? a : b) > c) ? b : c);
		int highest3 = ((a>b && a>c) ? a : (b>c ? b : c));
		int highest4 = ((a>b && a>c && a>d) ? a : ((b>c && b>d) ? b : (c>d ? c : d)));
		System.out.println("The highest3 no is:" + highest3);
		System.out.println("The highest4 no is:" + highest4);
	}
}
