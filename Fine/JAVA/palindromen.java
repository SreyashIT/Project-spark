import java.util.*;
class palindromen
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,temp,rn=0,d;
		System.out.println("enter the number");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{	
			d=n%10;
			rn=rn*10+d;
			n=n/10;
		}
		if(rn==(temp))
			System.out.println(" the given number is palindrome");
		else
			System.out.println(" the given number is not palindrome");
	}
}