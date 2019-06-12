package hmap; 


import java.util.* ;

class   F3
{
	public static void main(String[] args) 
	{
		Map <Integer , String> m = new HashMap<>() ;
		Scanner sc = new Scanner(System.in) ;
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		m.put(4,"idli") ;
		System.out.println(m) ;
		System.out.println(m.entrySet()) ;
		Set <Map.Entry<Integer , String>>ls = new Set<>() ;
		ls = m.entrySet() ;
		System.out.println(ls) ;
	
	}
}

