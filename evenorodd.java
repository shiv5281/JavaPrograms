import java.util.Scanner;
class evenorodd
{
	public static void main(String[] args)
	{
		int x;
		System.out.println(" Enter any number to check wether the number is EVEN or ODD " );
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
	       if(x%2==0)
		       System.out.println(" the number you have entered is EVEN ");
	       else
		       System.out.println(" the number you have entered is ODD ");
	       System.out.println(" Thank You ! NAMASTHE " );
	}
}


