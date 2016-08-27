class Volumecylinder
{
	public static void main(String args[])
	{
		float r,h,vol;
		r=Integer.parseInt(args[0]);
		h=Integer.parseInt(args[1]);
		vol=(22/7)*r*r*h;
		System.out.println("volume is: "+vol);
	}
}