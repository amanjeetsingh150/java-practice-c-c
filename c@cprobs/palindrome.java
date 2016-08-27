import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t,num,rem,flag=1;
		string newnum="",check="";
		t=sc.nextInt();
		while(t)
		{
			num=sc.nextint();
			newnum="";check="";
			while(num>0&&flag==1)
			{
				rem=num%10;
				newnum+=rem;
				num/=10;
				check=num;
				if(check.equals(newnum))
				{
					flag=0;
					System.out.println("palindrome number");
				}
			}
			if(flag==1)
				System.out.println("not a palindrome");
			t--;
		}
	}
}