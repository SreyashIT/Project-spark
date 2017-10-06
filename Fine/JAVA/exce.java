import java.util.*;
public class exce
{
    public static void main(String[] args)
    {
        try
        {
			Scanner s=new Scanner(System.in);
            System.out.println("Enter the numerator");
			int a=s.nextInt();
			System.out.println("Enter the denominator");
			int b=s.nextInt();
            float c = a/b;
			System.out.println("The division is "+c);
         }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        finally
        {
            System.out.printf("Finally is always executed");
        }
    }
}