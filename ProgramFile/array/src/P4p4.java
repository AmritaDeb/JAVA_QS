
/*Read input from user and obtain sum of all the elements of an array*/


class P4p4 
{
	public static void main(String[] args) 
	{
		int a[] = {4,6,2};
		
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of the array elements:" + sum);
	}
}
