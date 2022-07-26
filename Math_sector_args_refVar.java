class Sector
{
	void area(int r,double angle)
	{
		double res=3.14*r*r*(angle/360);
		System.out.println("The area of sector is "+res);
	}
	
}

class Math_sector_args_refVar
{
	public static void main(String [] args)
	{
		Sector s1=new Sector();
		s1.area(10,30);
	}
}