class Triangle
{
	void area(int base,int height)
	{
		double res=0.5*base*height;
		System.out.println("The area of Triangle is "+res);
	}
	
}

class Math_Triangle_args_refVar
{
	public static void main(String [] args)
	{
		Triangle t1=new Triangle();
		t1.area(10,20);
	}
}