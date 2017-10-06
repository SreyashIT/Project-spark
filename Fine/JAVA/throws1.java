import java.io.IOException;  
class throws1
{  
	void A()throws IOException
	{  
		throw new IOException("device error");
    }  
	void B()throws IOException
	{  
		m();  
	}  
	void C()
	{  
		try
		{  
			n();  
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}  
	}  
	public static void main(String args[])
	{  
		Testthrows1 dps=new Testthrows1();  
		dps.A();  
		System.out.println("normal flow...");  
	}  
}  