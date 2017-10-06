class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B - "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class Multiple_Thread1
{
	public static void main(String args[])
	{
		A t1=new A();
		B t2=new B();
		t1.start();
		t2.start();
	}
}