

class a2 
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome   To Bangalore";
		char[] ch = s1.toCharArray();
		int count=0;
		for (int i=0; i<ch.length; i++)
		{
			if (ch[i] == ' ')
			{
				count++;
			}
		}
		System.out.println("The no of words are: " + (count+1));
	}
}
