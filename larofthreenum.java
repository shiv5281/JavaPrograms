import java.util.Scanner;
class larofthreenum
{
	public static void main(String[] args)
	{
		int x,y,z;
		System.out.println(" Enter the three numbers x,y,z " );
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		if(x>y && x>z)
			System.out.println(" The largest number among three numbers is x" );
		else if(y>x && y>z)
			System.out.println(" The largest number among three numbers is y ");
		else if(z>x && z>y)
			System.out.println(" The largest number among three numbers is z ");
	}
}

