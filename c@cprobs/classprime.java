import java.util.Scanner;
class classprime
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num[]=new int[5],ctr,i;
		for(i=0;i<5;++i)
			num[i]=sc.nextInt();
		ctr=prime.primectr(num);
		System.out.println("there are "+ctr+" primes in the array");
	}	
}
class prime
{
	static int primectr(int num[])
	{
		int i,flag,j,ctr=0;
		for(i=0;i<5;++i)
		{
			flag=1;
			for(j=2;j<=num[i]/2;++j)
			{
				if(num[i]%j==0)
				{
					flag=0;
					break;
				}
			}
		if (flag==1)
			++ctr;
		}
		return ctr;
	}	
}