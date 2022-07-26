class Triangle
{
	void area()
	{
		int base=10,height=20;
		double res=0.5*base*height;
		System.out.println("The area of Triangle is "+res);
	}
	
}

class Math_Triangle_refVar
{
	public static void main(String [] args)
	{
		Triangle t1=new Triangle()
		t1.area();
	}
}