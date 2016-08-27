import java.util.Scanner;
import java.util.GregorianCalendar;
class Systemtime
{
	public static void main(String args[])
	{
		time T=new time();
		T.getinputtime();
		System.out.println("\t\t..welcome..\t\t");
		Scanner sc=new Scanner(System.in);
		int t=5,ch;
		Bank B1=new Bank();
		Bank B2=new Bank();
		B1.create();
		B2.create();
		while(t>0)
		{
			System.out.println("\t\t\t MENU\t\t\t");
			System.out.println("\n\n\n1st user has only "+t+" chances left to do any process");
			System.out.println("\n\n\n1.withdraw");
			System.out.println("2.deposite");
			System.out.println("3.show");
			System.out.println("\n\n\n enter the process number which you want to perform :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					B1.withdraw();
					break;
				case 2:
					B1.deposite();
					break;
				case 3:
					B1.show();
					break;
				case 4:
				default:
					System.out.println("Invalid Entry. try again!");
					continue;
			}
			--t;	
		}
		t=5;
		while(t>0)
		{
			System.out.println("\t\t\t MENU\t\t\t");
			System.out.println("\n\n\n2nd user has only "+t+" chances left to do any process");
			System.out.println("\n\n\n1.withdraw");
			System.out.println("2.deposite");
			System.out.println("3.show");
			System.out.println("\n enter the process number which you want to perform :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					B2.withdraw();
					break;
				case 2:
					B2.deposite();
					break;
				case 3:
					B2.show();
					break;
				default:
					System.out.println("Invalid Entry. try again!");
					continue;
			}
			--t;
		}
	}
/
}


class time
{
	GregorianCalendar gc = new GregorianCalendar();
	int inhr,inmin,outhr,outmin;
	void getinputtime()
	{
		inhr=gc.getCalendar.HOUR();
		inmin=gc.getCalendar.MINUTE();
		
	}
	void getoutputtime()
	{
		outhrhr=gc.getCalendar.HOUR();
		outmin=gc.getCalendar.MINUTE();
	}
	void calculate()
	{
		int hr,min;
		hr=outhr-inhr;
		min=outmin-inmin;
	}
	void show()
	{
		System.out.println("Input time is- "+inhr+":"+inmin);
		System.out.println("Output time is- "+outhr+":"+outmin);
		System.out.println("Access time is- "+hr+":"+min);
	}
}




	

class Bank
{
	Scanner sc=new Scanner(System.in);
	int accno,i=0;
	char name[]=new char[20];
	int bal;
	int acctype;
	void create()
	{
		System.out.println("enter the account number :");
		accno=sc.nextInt();
		System.out.println("enter your name :");
		//di'nt know how to input the name
		System.out.print("enter the amount of money you want to open your bank account with:");
		bal=sc.nextInt();
		System.out.print("enter the type of account you want to hold-1 for Savings and 2 for current:");
		acctype=sc.nextInt();
		System.out.println("Congrats!! Bank account created successfully!! :)");
	}
	{
	void withdraw()
		int draw;
		System.out.println("enter the amount you want to withdraw :");
		draw=sc.nextInt();
		if(draw>bal)
		{
			System.out.println("\nSORRY!!.The amount you've entered is greater than the amount in your account.\n");
			withdraw();
		}	
		else
		{
			System.out.println("\nSuccessfully money transacted.!!collect your money.\n");
			bal-=draw;
		}
	}
	void deposite()
	{
		float add;
		System.out.println("enter the amount of money you want t add in your account");
		add=sc.nextInt();
		bal+=add;
			System.out.println("Successfully money deposited.! Now your new balance is "+bal);
	}
	void show()
	{
		int check;
		System.out.println("enter the account number: ");
		check=sc.nextInt();
		if(check==accno)
		{
			System.out.println("Details of bank account with account number "+check+" are\n");
			System.out.println("account holder name : Did'nt know how to input it!!");
			System.out.println("balance is"+bal);
		}
		else 
		{
			System.out.println("SORRY!!The account number which you entered did not match. Try again");
			show();	
		}
	}
}