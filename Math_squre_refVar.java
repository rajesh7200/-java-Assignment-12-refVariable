class Squre
{
	void area()
	{
		int side=10;
		int res=side*side;
		System.out.println("The area of Squre is "+res);
	}
	
}

class Math_squre_refVar
{
	public static void main(String [] args)
	{
		Squre s1=new Squre();
		s1.area();
	}
}