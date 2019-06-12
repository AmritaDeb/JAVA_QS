
import java.util.ArrayList;

class a5
{
	public static void main(String[] args) 
	{
		ArrayList ls = new ArrayList();
		ls.add("Amy");
		ls.add(20);
		ls.add('a');
		ls.add(true);
		ls.add(10.2f);
		System.out.println(ls);
		ls.remove("Amy");
		System.out.println(ls);
		ls.remove(10.2f);
		System.out.println(ls);
		ls.remove('a');
		System.out.println(ls);
	}
}
