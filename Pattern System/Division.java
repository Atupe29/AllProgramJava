class Division 
{
	public static void main(String[] args) 
	{
	try
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println(c);
	}//try
	catch (ArrayIndexOutOfBoundsException aiob)
	{
		System.out.println("Please pass atleastt two integer values");
	}//catch
	catch (NumberFormatException nfe)
	{
		System.out.println("Please pass only integer values");
	}//catch
	catch (ArithmeticException ae)
	{
		System.out.println("Please Do not pass second value as zero ");
	}//catch
			
	}//main
}//class
