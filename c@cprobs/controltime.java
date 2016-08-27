import java.util.Scanner;
class time
{
	
	
	Scanner sc=new Scanner(System.in);
	int inhr,inmin,outhr,outmin,hr,min;
	
	void input()
	{
		System.out.println("Enter the login hr :");
		inhr=sc.nextInt();
		System.out.println("Enter the login min :");
		inmin=sc.nextInt();
		System.out.println("Enter the logout hr :");
		outhr=sc.nextInt();
		System.out.println("Enter the logout min :");
		outmin=sc.nextInt();
	}
	void calculate()
	{
		hr=outhr-inhr;
		min=outmin-inmin;
	}
	void show()
	{
		System.out.println("The login hr is :"+inhr);
		System.out.println("The login min is :"+inmin);
		System.out.println("The logout hr is :"+outhr);
		System.out.println("The logout min is :"+outmin);
		System.out.println("The access time to the system is :"+hr+":"+min);
	}
}

class controltime
{
	public static void main(String args[])
	{
		System.out.println("\t\t -:WELCOME:-\t\t");
		time T=new time();
		T.input();
		T.calculate();
		T.show();
	}
}