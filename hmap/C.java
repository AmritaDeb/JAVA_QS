package hmap; 

import java.util.Map ;
import java.util.HashMap ;

class   C
{
	public static void main(String[] args) 
	{
		Map <Integer , String> m = new HashMap<>() ;
		System.out.println(m.isEmpty()) ;
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		Map <Integer , String> m1 = new HashMap<>() ;
		m1.put(1, "chutney") ;
		m1.put(4, "fried rice") ;
		System.out.println(m);
		System.out.println(m1);
		m.putAll(m1) ;
		System.out.println(m);
	}
}



