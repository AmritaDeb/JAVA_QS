
/*multiplication of array values*/

class P11 
{
	public static int pro(int [] a)
	{
		int res = 1;
		for (int i=0; i<a.length; i++)
		{
			res*=a[i];
		}
		return res;
	}

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(pro(arr));
	}
}
