class Division
{
	public static void main (String args[])
	{
		int num1,num2,div;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		try{
			div=num1/num2;
			System.out.println("division of the given 2 numbers are"+div);
		}
		catch(Exception e){
			System.out.println("Exception occured: "+e);
			
		}
		
	}
}

