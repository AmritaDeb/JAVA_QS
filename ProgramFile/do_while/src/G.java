class G
{
	public static void main(String[] args) 
	{
	int k=1;
	for(int j=0; j<3; j++)
	{
		for(int i=0; i<3; i++)
		{
			System.out.print(k++);
			if (k==7)
			{
				k=1;
			}	
		}
		System.out.println();
	}
	
	}

}


/*

123
456
123

*/