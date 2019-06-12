class H
{
	public static void main(String[] args) 
	{
		char x='A';
		int k=1;
		for(int j=0; j<3; j++)
		{
			for(int i=0; i<3; i++)
			{
			System.out.print(x++);
			if (x=='G')
			{
				break;
			}
			System.out.print(k++);
			}
		System.out.println();
		}
	
	}

}


/*

A1B2C3
D4E5F
G6H7I8

*/