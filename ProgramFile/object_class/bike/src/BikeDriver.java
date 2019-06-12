class BikeDriver 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike("r15" , 25 , 100) ;
		System.out.println(b1) ;
		b1.move() ;
		b1.trip("goa") ;
		Bike b2 = new Bike("r15" , 25 , 100 ) ;
		System.out.println(b2) ;
		b2.move() ;
		b2.trip("pg") ;
		System.out.println("---------------------------------");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
	}
}
