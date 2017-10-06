import java.util.*;
public class Newexce
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			if(a==0)
			{
				throw new excep();
			}
			int c=10/0;
			System.out.println("c");
		}
		catch(excep e)
		{
			System.out.println("Exception is catched");
		}
	}
}

class excep extends Exception
{
	excep()
	{
		System.out.println("Divided by zero");
	}
}