import java.io.*;
public class Example
{
	void mymethod(int num)throws IOException
	{
		class NotFoundException;
		{
			if(num==1)
				throw new IOException("Eception Message 1");
			else
				throw new classNotFoundException("Exception Message 2");
		}
	}
}

public class Throwsex
{
	public static void main()
	{
		try
		{
			Example dps=new Example();
			dps.mymethod(1);
		}
		catch(exception e)
		{
			System.out.println(e);
		}
	}
}