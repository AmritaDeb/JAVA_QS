
/*
	swap first 2 elements from array
*/


class a11
{
	public static void main(String[] args) 
	{
		int [] a = {20,10,30,40};
		
		System.out.println("before swapping");
		System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
		
		/*
		int temp;
		temp=a[0];
		a[0]=a[1];
		a[1]=temp;
		*/

		System.out.println("after swapping");
		
		/*
		if (a[0]==a[1])
		{
			System.out.println("Both elements are same, so swapping is not needed");
		}
		else if (a[0]<a[1])
		{
			a[1]=a[1]-a[0];
			a[0]=a[0]+a[1];
		}
		else
		{
			a[0]=a[0]-a[1];
			a[1]=a[1]+a[0];
		}
		*/

		a[0] = a[0] + a[1];
		a[1] = a[0] - a[1];
		a[0] = a[0] - a[1];
		
		
		System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
	}
}
