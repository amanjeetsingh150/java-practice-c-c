import java.util.Scanner;
class level
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int level;
		System.out.println("Enter the level :\n");
		level=sc.nextInt();
		child c1=new child();
	}
}

class child implements runnable
{
	Thread t;
	String name;
	child(String N)
	{
		t=new Thread(this,N);
	}
	public void run()
	{
		try
		{
			for()
		}
	}
}