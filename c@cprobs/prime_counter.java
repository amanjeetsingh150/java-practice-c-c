import java.util.Scanner;
class prime_counter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[]=new int [5],ctr=0,i,flag=1,j;
		for(i=0;i<5;++i)
			num[i]=sc.nextInt();
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
		System.out.println("number of prime numbers are "+ctr);
	}
	
}