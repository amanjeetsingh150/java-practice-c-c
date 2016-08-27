import java.util.Scanner;
class multi_threading
{
	public static void main(String args[])
	{
		int i;
		childth c1=new childth("one");
		try
		{
			for(i=0;i<10;++i)
			{
				Thread.sleep(1000);
				System.out.println(i+"main");
			}
		}
		catch(InterruptedException I)
		{
			System.out.println("Exception occured");
		}
		
	}
}

class childth extends Thread
{
	String name;
	childth(String N)
	{
		super(N);
		name=N;
		start();
	}
	public void run()
	{
		int i;
		try
		{
			for(i=0;i<10;++i)
			{
				System.out.println(i+" "+name);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException I)
		{
			System.out.println("Exception occured");
		}
	}
}