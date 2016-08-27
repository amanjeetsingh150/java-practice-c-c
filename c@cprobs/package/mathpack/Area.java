package mathpack;
public class Area
{
	public double circle(double r)
	{
		double area;
		area=(22/7)*r*r;
		return area;
	}
	public double square(double s)
	{
		double area;
		area=s*s;
		return area;
	}
	public double triangle(double h,double b)
	{
		double ar;
		ar=0.5*h*b;
		return ar;
	}
	public double triangle(double s1,double s2,double s3)
	{
		double s,ar;
		s=(s1+s2+s3)/2;
		ar=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
		return ar;
	}
}
