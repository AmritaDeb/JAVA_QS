
import java.util.Scanner;

class a6
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the string: ");
		String s1 = s.nextLine();
		int count=1;
		if (s1.length()==0)			//if(s1.isEmpty())
		{
			count = 0;
		}
		else
		{
			char[] ch = s1.toCharArray();
		
			for (int i=0; i<ch.length; i++)
			{
				if (ch[i] == ' ' && i<ch.length-1 && ch[i+1] != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("The no of words are: " + count);
	}
}
