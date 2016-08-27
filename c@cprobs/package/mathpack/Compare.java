package mathpack;
public class Compare
{
	public double biggest(double num1,double num2)
	{
		double big;
		big=num1;
		if(num1>num2)
		big=num2;
		else if(num2>num1)
			big=num1;
		return big;
	}
	public double biggest(double num1,double num2,double num3,double num4)
	{
		double big=num1;
		if(num2>big)
			big=num2;
		if(num3>big)
			big=num3;
		if(num4>big)
			big=num4;
		return big;
	}	
	public double smallest(double num1,double num2)
	{
		double small;
		small=num1;
		if(num1<num2)
			small=num2;
		else if(num2<num1)
			small=num1;
		return small;
	}
	public double smallest(double num1,double num2,double num3)
	{
		double small;
		small=num1;
		if(num2<small)
			small=num2;
		else if(num3<small)
			small=num3;
		
		return small;
	}
}
