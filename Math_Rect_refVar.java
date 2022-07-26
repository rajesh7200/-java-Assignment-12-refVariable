class Rect
{
	void area()
	{
		int w=10,l=20;
		int res=w*l;
		System.out.println("The area of Rect is "+res);
	}
	
}

class Math_Rect_refVar
{
	public static void main(String [] args)
	{
		Rect r1=new Rect();
		r1.area();
	}
}