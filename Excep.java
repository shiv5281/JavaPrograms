class Excep
{
	public static void main(String[] args)
	{ 
		try
		{
			int i = 10/0;
			System.out.println(" Occurs Zero Division  Exception ");
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Catch block will be printed ");
		}
		finally
		{ 
			System.out.println(" Finally block will be printed ");

		}

	}
}

