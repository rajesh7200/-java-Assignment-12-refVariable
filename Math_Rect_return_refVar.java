class Rect
{
	int area(int w,int l)
	{
		int res=w*l;
		return res;
	}
	
}

class Math_Rect_return_refVar
{
	public static void main(String [] args)
	{
		Rect r1=new Rect();
		int x=r1.area(10,20);
		System.out.println("The area of Rect is "+x);

	}
}