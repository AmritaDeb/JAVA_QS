
/*
	wap to obtain 2nd max values of array
*/

class a11 
{

	public static int maxValue(int[] a)
	{
		int max = a[0];
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i] > max)
			{
				max = a[i]; 
			}
		}
		return max;
	}

	public static int max2Value(int[] a)
	{
		int max1, max2;
		max1 = max2 = a[0];
		
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i] > max1 && max1 != max2)
			{
				max2 = max1;
				max1 = a[i];
			}
			if (a[i] > max2 && a[i] < max1)
			{
				max2 = a[i];
			}
		}
		return max2;
	}
	
	public static void main(String[] args) 
	{
		//int[] a = {30,20,40,40};
		int[] a = {-10,5,30, 30,30};
		System.out.println("Max value:" + maxValue(a));
		System.out.println("2nd Max value:" + max2Value(a));
	}
}
