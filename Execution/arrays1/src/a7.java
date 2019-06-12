
class a7
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome to Bangalore";
		char[] ch = s1.toCharArray();
		int length=0;
		int count=0;
		for (int i=0; i<ch.length; i++)
		{	
			length=0;
			count++;
			while (ch[i] != ' ' && i<ch.length-1)
			{
				length++;
				i++;
			}
			System.out.println("The length of word: " + count + "is: " + length);
		}
		System.out.println("The no of words are: " + count);
	}
}
