import java.util.Scanner;
class figures
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		rectangle rec=new rectangle();
		square sq=new square();
		circle ci=new circle();
		System.out.println("\t\tWELCOME\t\t");
		int ch;
		System.out.println("1.rectangle\n\n2.square\n\n3.circle\n\n Enter your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				rec.input();
				break;
			case 2:
				sq.input();
				break;
			case 3:
				ci.input();
				break;
			default:
				System.out.println("Invalid option!");
		}
	}
}

class rectangle implements shape
{
	Scanner sc=new Scanner(System.in);
	double l,b,p,a;
	public void input()
	{
		System.out.println("Enter the length: ");
		l=sc.nextFloat();
		System.out.println("Enter the breath: ");
		b=sc.nextDouble();
		p=perimeter();
		a=area();
		System.out.println("The perimeter is : "+p+" and the area is : "+a);
	}
	public double perimeter()
	{
		return 2*(l+b);
	}
	public double area()
	{
		return l*b;
	}
}

class square implements shape
{
	double s,p,a;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		s=sc.nextDouble();
		p=perimeter();
		a=area();
		System.out.println("The perimeter is : "+p+" and the area is : "+a);
	}
	public double perimeter()
	{
		return 4*s;
	}
	public double area()
	{
		return s*s;
	}
}
class circle implements shape
{
	double r,p,a;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		r=sc.nextDouble();
		p=perimeter();
		a=area();
		System.out.println("The perimeter is : "+p+" and the area is : "+a);
	}
	public double area()
	{
		return 3.14*r*r;
	}
	public double perimeter()
	{
		return 2*3.14*r;
	}
}