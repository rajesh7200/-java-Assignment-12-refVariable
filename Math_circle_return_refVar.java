class Circle
{
	
	double area(int r)
	{
		double res=3.14*r*r;
		return res;
	}
	
}

class Math_circle_return_refVar
{
	public static void main(String [] args)
	{
		Circle c1=new Circle();
		double x=c1.area(10);
		System.out.println("The area of circle is "+x);
	}
}