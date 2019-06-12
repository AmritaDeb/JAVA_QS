package hmap; 


import java.util.* ;

class   F
{
	public static void main(String[] args) 
	{
		Map <Integer , String> m = new HashMap<>() ;
		Scanner sc = new Scanner(System.in) ;
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		System.out.println(m) ;
		System.out.println(m.keySet()) ;
	}
}