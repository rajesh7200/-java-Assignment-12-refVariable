class Trapezoid
{
	double area(int a,int b,int h)
	{
		double res=0.5*(a+b)*h;
		return res;
	}
	
}

class Math_Trapezoid_return_refVar
{
	public static void main(String [] args)
	{
		Trapezoid t1=new Trapezoid();
		double x=t1.area(10,20,30);
		System.out.println("The area of Trapezoid is "+x);
	}
}