import java.util.Scanner;
class controlcricket
{
	public static void main(String A[])
	{
		Scanner sc=new Scanner(System.in);
		int status;
		batsman b=new batsman();
		b.init();
	
		for(status=1;status!=0;)
		{
			status=b.update();
		}
	}
}

class batsman
{
	Scanner sc=new Scanner(System.in);
	String bnm,countrynm;
	int bno,runs,status,nof4,nof6,ballsplayed,cno;
	void init()
	{
		//batsman name and country name is assigned here. Values being taken from the user.
		System.out.println("Enter the batsman number and country number");
		bno=sc.nextInt();//sub of batsman name.
		cno=sc.nextInt();//sub of country name.
		status=1;
		runs=0;
		nof4=0;
		nof6=0;
		ballsplayed=0;
	}
	int update()
	{
		int runsperball;
		++ballsplayed;
		System.out.println("is he OUT?? 0 for yes, 1 for no");
		status=sc.nextInt();
		if(status==0)
			this.show();
		else
		{//
			System.out.println("Enter the runs scored :");
			runsperball=sc.nextInt();
			runs+=runsperball;
			if(runsperball==4)
				++nof4;
			else if(runsperball==6)
				++nof6;
		}
			return status;
	}
	void show()
	{
		if(status==0)
		{
			System.out.println(" name : ");
			System.out.println("batsman number :"+bno);
			System.out.println("country number :"+cno);
			System.out.println("runs :"+runs);
			System.out.println("number of 6's :"+nof6);
			System.out.println("number of 4's :"+nof4);
			System.out.println("balls played "+ballsplayed);
		}
	}
}