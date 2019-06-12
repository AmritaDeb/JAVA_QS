class A
{
	public static void main(String[] args) 
	{
		int i=1;
		int sum = 0;
		do{
			sum = sum+i;
			//System.out.println("No:" + i);
			i++;
		}while(i<=100);
		System.out.println("No:" + sum);
	}
}
