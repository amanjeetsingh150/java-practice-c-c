class Swape
{
	public static void main(String args[])
	{
		int num1,num2;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num1+=num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("swaped numbers are:"+num1+"and"+num2);
	}
	
}