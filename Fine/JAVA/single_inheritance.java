import java.util.*;
class operation
{
	int z;
	public void addition(int a,int b)
	{
		z=a+b;
		System.out.println("the addition of two numbers is "+z);
	}
	public void sub(int a,int b)
	{
		z=a-b;
		System.out.println("the difference between two numbers is "+z);
	}
	public void multiplication(int a,int b)
	{
		z=a*b;
		System.out.println("the product of two numbers is "+z);
	}
	
}

public class single_inheritance extends operation
{
	
	public static void main(String args[])
	 {
		Scanner s= new Scanner(System.in);
		int a,b;
		single_inheritance dps=new single_inheritance();
		System.out.println("Enter the value of a");
		a=s.nextInt();
		System.out.println("Enter the value of b");
		b=s.nextInt();
		dps.addition(a,b);
		dps.sub(a,b);
		dps.multiplication(a,b);
	}
}