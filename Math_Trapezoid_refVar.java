class Trapezoid
{
	void area()
	{
		int a=10,b=20,h=10;
		double res=0.5*(a+b)*h;
		System.out.println("The area of Trapezoid is "+res);
	}
	
}

class Math_Trapezoid_refVar
{
	public static void main(String [] args)
	{
		Trapezoid t1=new Trapezoid();
		t1.area();
	}
}