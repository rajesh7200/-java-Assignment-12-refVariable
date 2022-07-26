class Parallelogram
{
	void area()
	{
		int base=20,height=10;
		double res=base*height;
		System.out.println("The area of Parallelogram is "+res);
	}
	
}

class Math_Parallelogram_refVar
{
	public static void main(String [] args)
	{
		Parallelogram p1=new Parallelogram();
		p1.area();
	}
}