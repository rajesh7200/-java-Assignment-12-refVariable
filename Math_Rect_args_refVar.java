class Rect
{
	void area(int w,int l)
	{
		int res=w*l;
		System.out.println("The area of Rect is "+res);
	}
	
}

class Math_Rect_args_refVar
{
	public static void main(String [] args)
	{
		Rect r1=new Rect();
		r1.area(10,2);
	}
}