import java.util.Scanner;
class bigger
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
			System.out.println(num1+" is bigger than "+ num2);
		else if(num2>num1)
			System.out.println(num2+" is bigger than "+ num1);
		else
			System.out.println(num1+" and "+ num2+" both are equal");
	}
}