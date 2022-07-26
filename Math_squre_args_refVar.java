class Squre
{
	void area(int side)
	{
		int res=side*side;
		System.out.println("The area of Squre is "+res);
	}
	
}

class Math_squre_args_refVar
{
	public static void main(String [] args)
	{
		Squre s1=new Squre();
		s1.area(10);
	}
}