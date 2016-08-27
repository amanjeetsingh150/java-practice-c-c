class Heronstriangle
{
	public static void main(String args[])
	{
		double s1,s2,s3,s,ar;
		s1=Integer.parseInt(args[0]);
		s2=Integer.parseInt(args[1]);
		s3=Integer.parseInt(args[2]);
		s=(s1+s2+s3)/2;
		ar=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
		System.out.println("the area of the triangle is: "+ar);
		
	}
}
