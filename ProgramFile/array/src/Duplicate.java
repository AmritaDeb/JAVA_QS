
/*Find the duplicate element in array*/

class Duplicate 
{
	public static void main(String[] args) 
	{
		int a[] = {50,30,20,20,30,20,40};
		int size=a.length;
		for (int i=0; i<size; i++)
		{
			int count = 1;
			for (int j=i+1; j<size; j++)
			{
				if (a[i]==a[j])
				{
					count++;
					int k = j;
					while (k<size-1)
					{
						a[k]=a[k+1];
						k++;
					}
					j--;
					size=size-1;
				}
			}
			
			
				System.out.println(a[i]+"is :"+count);
			
			
		}
		
	}
}
