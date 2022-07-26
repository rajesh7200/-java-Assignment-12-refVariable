class Squre
{
	int area(int side)
	{
		int res=side*side;
		return res;
	}
	
}

class Math_squre_return_refVar
{
	public static void main(String [] args)
	{
		Squre s1=new Squre();
		int x=s1.area(10);
		System.out.println("The area of Squre is "+x);
	}
}