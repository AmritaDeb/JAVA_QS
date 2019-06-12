
/*
	jagged integer array
*/

class j1 
{
	public static void main(String[] args) 
	{
		int[][] a = new int[3][];
		a[0] = new int[3];
		System.out.println("------------------");
		System.out.print(a[0][0]);
		System.out.print(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println("------------------");
		a[1] = new int[2];
		System.out.println("------------------");
		System.out.print(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println("------------------");
		a[2] = new int[4];
		System.out.println("------------------");
		System.out.print(a[2][0]);
		System.out.print(a[2][1]);
		System.out.print(a[2][2]);
		System.out.println(a[2][3]);
		System.out.println("------------------");
		
	}
}
