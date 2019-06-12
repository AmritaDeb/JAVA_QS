
/*
	swap first 2 elements from array by using method
*/


class a13
{
	static void swap(int[] x, int i, int j)
	{
		x[i] = x[i] + x[j];
		x[j] = x[i] - x[j];
		x[i] = x[i] - x[j];
	}
	public static void main(String[] args) 
	{
		int [] a = {22,54,30,40};
		
		System.out.println("before swapping");
		System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
		
		swap(a,0,1);  //array ref variable, index, index

		System.out.println("after swapping");		
		
		System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
	}
}
