import java.util.*;
class rectangle
{	
	public static void main(String arg[])
	{
		int l,b,a,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		l=s.nextInt();
		System.out.println("Enter the bredth of rectangle");
		b=s.nextInt();
		a=l*b;
		p=2*(l+b);
		System.out.println("Area of rectangle is "+a);
		System.out.println("perimeter of the rectangle is "+p);
	}
}
	
	