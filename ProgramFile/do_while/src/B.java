class B
{
	static void test(int i)
		{
			//System.out.println(i++);
			System.out.println("No:" + i);
			i++;
			if(i==251)
			{
				System.out.println("No:" + i);
				return;
			}
		test(i);
		}
		public static void main(String [] args)
		{
			//System.out.println("No:" + i);
			test(150);
		}
}
