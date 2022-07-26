class Sector
{
	void area()
	{
		int r=10;
		double angle=60.0;
		double res=3.14*r*r*(angle/360);
		System.out.println("The area of Sector is "+res);
	}
	
}

class Math_sector_refVar
{
	public static void main(String [] args)
	{
		Sector s1=new Sector();
		s1.area();
	}
}