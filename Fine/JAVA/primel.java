import java.util.*;
class primel
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int f,e;
		System.out.println("Enter the limits");
		System.out.println("Enter the lower limit");
		f=s.nextInt();
		System.out.println("Enter the upper limit");
		e=s.nextInt();
		System.out.println("The prime numbers are ");
		for(int n=f;n<=e;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
			if(count==2)
				System.out.println("   "+n);
		}
	}
}