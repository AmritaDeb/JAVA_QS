
import java.util.HashSet;

class h1
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		System.out.println(hs);
		hs.add(10);
		System.out.println(hs);
		hs.add(20);
		System.out.println(hs);
		hs.add(30);
		System.out.println(hs);
		boolean flag = hs.add(10);
		System.out.println(flag);
	}
}
