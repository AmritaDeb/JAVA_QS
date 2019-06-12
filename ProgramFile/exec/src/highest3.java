class highest3 
{
	public static void main(String[] args) 
	{
		int a=20,b=10,c=30;
		//int highest=(((a>b ? a : b) > c) ? b : c);
		int highest = ((a>b && a>c) ? a : (b>c ? b : c));
		System.out.println("The highest no is:" + highest);
	}
}
