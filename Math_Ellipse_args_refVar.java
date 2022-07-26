class Ellipse
{
	void area(int a,int b)
	{
		double res=3.142*a*b;
		System.out.println("The area of Ellipse is "+res);
	}
	
}

class Math_Ellipse_args_refVar
{
	public static void main(String [] args)
	{
		Ellipse e1=new Ellipse();
		e1.area(10,20);
	}
}