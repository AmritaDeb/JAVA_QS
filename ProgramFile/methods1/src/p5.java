class p5
{
	static float toAdd(float a, float b)
	{
		float sum;
		sum = a + b;
		//System.out.println("value: " + (a+b));
		return sum;
	}
	public static void main(String[] args) 
	{
		float a=10.5f, b=20.5f;
		System.out.println("Main begin!");
		System.out.println("Sum:" + toAdd(a,b));  
		/*
		toAdd(a,b);
		System.out.println("Sum:" + sum);    //sum is not declared inside of this main method block
		*/
		System.out.println("Main end!");
	}
}