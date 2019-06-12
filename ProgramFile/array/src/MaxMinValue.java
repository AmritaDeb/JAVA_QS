/*Display the max & min value of an array*/

class MaxMinValue 
{
	static int a[] = {50,20,40,10,70};
	public static int maxValue()
	{
		int max = a[0];
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static int minValue()
	{
		int min = a[0];
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		System.out.println("The maximum value is: " + maxValue());
		System.out.println("The minimum value is: " + minValue());
	}
}
