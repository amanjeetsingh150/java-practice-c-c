import java.util.Scanner;
class biggest
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3,num4,big;
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	num4=sc.nextInt();
	big=num1;
	if(num2>big)
		big=num2;
	if(num3>big)
		big=num3;
	if(num4>big)
		big=num4;
	System.out.println(" the biggest number is "+big);
	}
}