import java.util.Scanner;
import mathpack.*; 
class usemathpack{
public static void main(String args[])
{
	int ch;
	double num2,num1,num3;
	Scanner sc=new Scanner(System.in);
	Area ar=new Area();
	Trigo t=new Trigo();
	Algebra a=new Algebra();
	System.out.println("1. Cube\n2.Square\n3. add\n4.Difference\n5.modulus\n6.factorial");
	System.out.println("7.Area of circle\n8.Area of square\n9.Area of trianlge(h and b)\n10.Area of trianlge(herons)");
	System.out.println("11.sin\n12.cos\n13.tan\n14.cosec\n15.sec\n16.cot");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
		
			//int num1;
			System.out.println("Enter the number : ");
			num1=sc.nextDouble();
			System.out.println("cube of the given number is : "+a.cube(num1));
			break;
		case 2:
			//int num1;
			System.out.println("Enter the number : ");
			num1=sc.nextDouble();
			System.out.println("square of the given number is : "+a.square(num1));
			break;
		case 3:
			//int num1,num2;
			System.out.println("Enter the numbers : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("sum of the given number is : "+a.add(num1,num2));
			break;
		case 4:
			//int num1,num2;
			System.out.println("Enter the numbers : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("difference of the given number is : "+a.diff(num1,num2));
			break;
		case 5:
			//int num1,num2;
			int n,d;
			System.out.println("Enter the numbers : ");
			n=sc.nextInt();
			d=sc.nextInt();
			System.out.println("remainder is : "+a.modulo(n,d));
			break;
		case 6:
			//int num1;
			int f;
			System.out.println("Enter the number : ");
			f=sc.nextInt();
			//num2=sc.nextInt();
			System.out.println("factorial of the given number is : "+a.fact(f));
			break;
		case 7:
			//int num1;
			System.out.println("Enter the radius : ");
			num1=sc.nextDouble();
			//num2=sc.nextInt();
			System.out.println("area of the given circle is : "+ar.circle(num1));
			break;
		case 8:
			//int num1;
			System.out.println("Enter the side : ");
			num1=sc.nextDouble();
			//num2=sc.nextInt();
			System.out.println("area of the given square is : "+ar.square(num1));
			break;
		case 9:
			//float num1,num2;
			System.out.println("Enter the sides of trianlge : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("area of the given trianlge is : "+ar.triangle(num1,num2));
			break;
		case 10:
			//double num1,num2,num3;
			System.out.println("Enter the 3 sides : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			num3=sc.nextDouble();
			System.out.println("area of the given trianlge is : "+ar.triangle(num1,num2,num3));
			break;
		case 11:
			//int num1,num2;
			System.out.println("Enter the value of p and h : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("sin of the given number trianlge is : "+t.sin(num1,num2));
			break;
		case 12:
			//int num1,num2;
			System.out.println("Enter the value of b and h : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("cos of the given number trianlge is : "+t.cos(num1,num2));
			break;
		case 13:
			//int num1,num2;
			System.out.println("Enter the value of p and b : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("tan of the given number trianlge is : "+t.tan(num1,num2));
			break;
		case 14:
			//int num1,num2;
			System.out.println("Enter the value of p and h : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("cosec of the given number trianlge is : "+t.cosec(num1,num2));
			break;
		case 15:
			//int num1,num2;
			System.out.println("Enter the value of b and h : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("sec of the given number trianlge is : "+t.sec(num1,num2));
			break;
		case 16:
			//int num1,num2;
			System.out.println("Enter the value of p and b : ");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("cot of the given number trianlge is : "+t.cot(num1,num2));
			break;
			default:
			System.out.println("invalid");
	}
}
}

