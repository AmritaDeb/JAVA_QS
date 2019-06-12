class I
{
	public static void main(String[] args) 
	{
		char x='A';
		int k=1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{

			if (i==2)
			{
				System.out.print(k++);
				//break;
			}
			else
			{
				System.out.print(x++);
			}
			//System.out.print(k++);
			}
		System.out.println();
		}
	
	}

}


/*

ABC
DEF
123

*/