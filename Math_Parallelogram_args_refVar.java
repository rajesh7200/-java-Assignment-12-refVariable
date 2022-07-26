class Parallelogram
{
	void area(int b,int h)
	{
	
		double res=b*h;
		System.out.println("The area of Parallelogram is "+res);
	}
	
}

class Math_Parallelogram_args_refVar
{
	public static void main(String [] args)
	{
		Parallelogram p1=new Parallelogram();
		p1.area(10,20);
	}
}