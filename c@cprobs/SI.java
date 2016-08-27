class SI
{
	public static void main(String args[])
	{
		float p,r,t,si;
		p=Integer.parseInt(args[0]);
		r=Integer.parseInt(args[1]);
		t=Integer.parseInt(args[2]);
		si=p*r*t/100;
		System.out.println("Simple interest is: "+si);
	}
}