abstract class TwoWeeler extends RoadVehicle 
{
	int no_of_tyres = 2 ;
	public String toString()
	{
		return "tyres: "+ no_of_tyres + "" ;
	}

	public boolean equals(Object manga)
	{
		return no_of_tyres == ((TwoWeeler)manga).no_of_tyres ;
	}

	public int hashCode()
	{
		int hc = 0 ;
		hc += no_of_tyres ;
		return hc ;
	}
}
