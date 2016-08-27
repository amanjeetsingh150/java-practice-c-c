import java.util.Scanner;

class gpthread
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int x;
		System.out.println("Enter the time for fastest thread in microseconds : ");
		x=sc.nextInt();
		child c3=new child("slow",4*x,10);
		child c2=new child("med",2*x,20);
		child c1=new child("fast",x,40);
		
		
	}
}

class child extends Thread
{
	String name;
	int x,limit;
	child(String n,int time,int lim)
	{
		super(n);
		//super(x);
		name=n;
		x=time;
		limit=lim;
		start();
	}
	public void run()
	{
		int i;
		try
		{
			for(i=1;i<=limit;++i)
			{
				System.out.println(name+" -> "+i+"\n");
				Thread.sleep(x);
			}
		}
		catch(InterruptedException I)
		{
			System.out.println("Error while running. abborrting....");
			System.exit(0);
		}
	}
}