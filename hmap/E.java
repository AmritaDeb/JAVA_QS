package hmap; 


import java.util.* ;

class   E
{
	public static void main(String[] args) 
	{
		Map <Integer , String> m = new HashMap<>() ;
		Scanner sc = new Scanner(System.in) ;
		m.put(1 ,"sheela") ;
		m.put(2 ,"dosa") ;
		m.put(3,"idli") ;
		System.out.println(m.get(3)) ;
		System.out.println(m.get(4)) ;
		int k ;
		System.out.println("Eneter the value for k") ;
		k = sc.nextInt() ;
		if (m.get(k) != null)
		{
			System.out.println(m.get(k)) ;
		}
		else
		{
			System.out.println("sorry key not found") ;
		}
	}
}