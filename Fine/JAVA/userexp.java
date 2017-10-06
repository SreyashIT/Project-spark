import java.util.*;
class Exception1 extends Exception
{
    public Exception1(String s)
    {
        super(s);
    }
}
 
public class userexp
{
	void intCheck(int x) throws Exception1
	{
		if(x<100)
		{
			throw new Exception1("Invalid number");
		}
		else
		{
			throw new Exception1("valid number");
		}
   }
   public static void main(String args[])    
   {
    	userexp dps = new userexp();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number above 100");
		int a=s.nextInt();
        try
        {
            dps.intCheck(a);
        }
        catch (Exception1 ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}