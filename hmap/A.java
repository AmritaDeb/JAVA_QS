package hmap; 

import java.util.Map ;
import java.util.HashMap ;

class   A
{
	public static void main(String[] args) 
	{
		Map m = new HashMap() ;
		System.out.println(m.isEmpty()) ;
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		m.put(4,"sheela") ;
		m.put("leela", 4) ;
		System.out.println(m.isEmpty()) ;
		System.out.println(m.size()) ;
		System.out.println(m) ;
	}
}
