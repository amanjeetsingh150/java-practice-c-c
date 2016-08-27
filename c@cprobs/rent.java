import java.util.Scanner;
class rent
{
	public static void main(String args[])
	{
		int unit;
		doubles rent;
		Scanner sc=new Scanner(System.in);
		unit= sc.nextInt();
		if(unit>500)
			rent=unit*2.5;
		else 
			rent=unit*2.0;
		System.out.println("rent is "+rent);
	}
}