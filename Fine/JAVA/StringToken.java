import java.util.*;
public class StringToken
{
	public static void main(String args[])
	{
  		String str;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		StringTokenizer a=new StringTokenizer(str," ",false);
		System.out.println("integers are ");
		while(a.hasMoreTokens())
    		{
			int b=Integer.parseInt(a.nextToken());
			sum=sum+b;
			System.out.println(" "+b);
			
     		}
		System.out.println("sum of integers is "+sum);
	}
}


