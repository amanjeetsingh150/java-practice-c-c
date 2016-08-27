import java.util.Scanner;
class loopq4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,diff=1,sum=0;
		num=sc.nextInt();
		while(diff<=num)
		{
			sum+=diff;
			diff+=2;
			System.out.print(sum+" ");
		}
	}
}