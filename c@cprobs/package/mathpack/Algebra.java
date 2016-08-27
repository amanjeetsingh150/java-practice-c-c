package mathpack;
public class Algebra
{
	public double cube(double num)
	{
		return num*num*num;
	}
	public double square(double num)
	{
		return num*num;
	}	
	public double add(double num1,double num2)
	{
		return num1+num2;
	}
	public double diff(double num1,double num2)
	{
		return num1-num2;
	}
	public double si(double p,double r, int t)
	{
		return (p*r*t)/100;
	}
	public int modulo(int num1,int num2)
	{
		return num1%num2;
	}
	public int fact(int num)
	{
		if(num==1)
			return 1;
		else 
			return num*fact(num-1);
	}
}
