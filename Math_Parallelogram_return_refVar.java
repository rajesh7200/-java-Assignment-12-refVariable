class Parallelogram
{
	double area(int b,int h)
	{
		double res=b*h;
		return res;
	}
	
}

class Math_Parallelogram_return_refVar
{
	public static void main(String [] args)
	{
		Parallelogram p1=new Parallelogram();
		double x=p1.area(10,20);
		System.out.println("The area of Parallelogram is "+x);
	}
}