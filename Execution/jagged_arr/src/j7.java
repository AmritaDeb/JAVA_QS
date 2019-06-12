
/*
	Welcome to Bangalore = Bangalore to Welcome
*/

class j7
{
	public static void main(String[] args) 
	{
		String str1 = "Welcome to Bangalore";
			//array of strings
		String[] str = str1.split(" ");			
		
		//generate the sentence
		String str2 = " ";
		System.out.println(str1);
		System.out.println("----------------");
		
		for (int i=str.length-1; i>=0; i--)
		{
			str2+= str[i];
			str2+=' ';
		}
		System.out.println(str2);
	}
}
