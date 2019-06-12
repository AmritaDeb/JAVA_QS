package hmap; 

import java.util.Map ;
import java.util.HashMap ;

class   D
{
	public static void main(String[] args) 
	{
		Map <Integer , String> m = new HashMap<>() ;
		
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		System.out.println(m.containsKey(1)) ;
		System.out.println(m.containsKey(5)) ;
		System.out.println(m.containsValue("dosa")) ;
	}
}
