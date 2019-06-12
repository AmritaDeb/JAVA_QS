
/*	
	WAP to obtain the number of vowels and number of consonants
*/


class a9
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter the size of the array:");
		//int size = s.nextInt();
		
		char [] a = "Soumyaa".toUpperCase().toCharArray();
		int count = 1;
		System.out.println(a);

		int vowel_count=0;
		int cons_count=0;
		int a_c=0, e_c=0, i_c=0, o_c=0, u_c=0; 

		for (int i=0; i<a.length; i++)
		{
			/*
			if (a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U')
			{
				vowel_count++;
			}
			else
			{
				cons_count++;
			}
			*/

			if (a[i]>= 'A' || a[i]<= 'Z')
			{
				switch (a[i])
				{
				case 'A':{
							a_c++;
							if (a_c == 1)
							vowel_count++;
						 }
						 break;
				case 'E':{
							e_c++;
							if (e_c == 1)
							vowel_count++;
						 }
						 break;
				case 'I':{
							i_c++;
							if (i_c == 1)
							vowel_count++;
						 }
						 break;
				case 'O':{
							o_c++;
							if (o_c == 1)
							vowel_count++;
						 }
						 break;
				case 'U': {
							u_c++;
							if (u_c == 1)
							vowel_count++;
						 }
						 break;
				default: cons_count++;
				}
			}
		}
		System.out.println("The number of vowels present: "+ vowel_count);
		System.out.println("The number of consonants present: "+ cons_count);
	}
}

