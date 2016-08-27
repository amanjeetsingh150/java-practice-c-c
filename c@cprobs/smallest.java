import java.util.Scanner;
class smallest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,small;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		small=num1;
		if(num2<small)
			small=num2;
		else if(num3<small)
			small=num3;
		
		System.out.println("the smallest number is "+small);
	}
}