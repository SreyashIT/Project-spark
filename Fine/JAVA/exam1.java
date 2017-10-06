import java.util.*;
class A
{
	public int read()
	{
		int a=s.nextInt();
		int b=s.nextInt();
	}
}

class B extends A
{
	public int add()
	{
		int c= a+b;
	}
}

class exam1 extends B
{
	public void print()
	{
		System.out.println("The sum is "+c);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		exam1 e=new exam1();
		e.read();
		e.add();
		e.print();
	}
}