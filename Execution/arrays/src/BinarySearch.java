
//Binary Search

class BinarySearch
{
	public static void main(String[] args) 
	{
		int [] a = {5,10,15,25};
		int start = 0;
		int end = a.length - 1;
		int mid = (start + end) / 2;
		int key = 25;
		boolean flag = true;
		while (start < a.length && end > -1)
		{
			mid = (start + end) / 2;
			if (a[mid] == key)
			{
				System.out.println("Element found");
				flag = false;
				break;
			}
			else if (key < a[mid])
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		if (flag)
		{
			System.out.println("Not found");
		}
	}
}
