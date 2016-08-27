import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,i,pro=1;
		num=sc.nextInt();
		for(i=num;i>0;--i)
		{
			pro*=i;
		}
		System.out.println("factorial is "+pro);
	}	
}