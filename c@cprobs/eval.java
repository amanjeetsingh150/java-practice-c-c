class eval
{
	public static void main(String args[])
	{
		float a,b,c,d,ans;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		ans=((a+b)*(c-d)/(a+d));
		System.out.println("answer is: "+ans);
	}
}