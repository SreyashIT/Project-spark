import java.util.*;
class circle
{
	
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int r;
		System.out.println("Enter the radius of the circle");
		r=s.nextInt();		
		double a=Math.PI*(r*r);
		double c=Math.PI*2*r;
		System.out.println("the area of the circle is "+a);
		System.out.println("the circumference of the circle is "+c);
	}
}
		