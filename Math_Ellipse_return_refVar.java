class Ellipse
{
	double area(int a,int b)
	{
		double res=3.142*a*b;
		return res;
	}
	
}

class Math_Ellipse_return_refVar
{
	public static void main(String [] args)
	{
		Ellipse e1=new Ellipse();
		double x=e1.area(10,20);
		System.out.println("The area of Ellipse is "+x);
	}
}