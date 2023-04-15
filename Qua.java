import java.io.*;
public class Qua
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br;
		int a,b,c;
		double x,y,z;
		System.out.println(" Enter the value of A ");
		br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		System.out.println(" Enter the value of B ");
		b=Integer.parseInt(br.readLine());
		System.out.println(" Enter the value of C ");
		c=Integer.parseInt(br.readLine());
		z=Math.sqrt(b*b-4*a*c);
		x=(-b+z)/(2*a);
		y=(-b-z)/(2*a);
		if(z>0) 
		{
			System.out.println(" The Real Roots are " );
			System.out.println(x);
			System.out.println(y);
		}
		else
		{
			System.out.println(" There are NO Real Roots ");
		}
	}
}


		
