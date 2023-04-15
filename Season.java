import java.util.Scanner;
public class Season
{
	public static void main(String[] args)
	{
		String Season;
		System.out.println(" Enter a month to check the present Season =      ");
		Scanner in = new Scanner(System.in);
		int entry =in.nextInt();
		switch(entry)
		{
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println(" The Present Season is : SUMMER. Don't Forget to Take Shelter ");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println(" The Present Season is : RAINY. Don't Forget to Carry Umbrella ");
				break;
			case 10:
			case 11:
			case 12:
			case 1:
				System.out.println(" The Present Season is : WINTER. Don't Forget to Wear Sweater ");
				break;
			default:
				System.out.println(" !!! Caution : Enter the Valid Month Number !!! ");
		}

	}
}

