class Triangle
{
	double area(int base,int height)
	{
		double res=0.5*base*height;
		return res;
	}
	
}

class Math_Triangle_return_refVar
{
	public static void main(String [] args)
	{
		Triangle t1=new Triangle();
		double x=t1.area(10,20);
		System.out.println("The area of Triangle is "+x);
	}
}