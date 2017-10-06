import java.util.*;

public class ariths
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);

		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		

		System.out.println("addition= "+(a+b));
		System.out.println("difference= "+(a-b));
		System.out.println("division= "+(a/b));
		System.out.println("remainder= "+(a%b));
		System.out.println("product= "+(a*b));
	}
}