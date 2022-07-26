class Circle
{
	void area()
	{
		int r=10;
		double res=3.14*r*r;
		System.out.println("The area of circle is "+res);
	}
	
}

class Math_circle_refVar
{
	public static void main(String [] args)
	{
		Circle c1=new Circle();
		c1.area();
	}
}