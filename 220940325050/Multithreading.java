class xyz extends Thread
{
	void run()
	{
	for (i=0;i<=5;i++)
	{
		System.out.println("prajakta")
	}
	}
}

class Multithreading
{
	public static void main(String args[])
	{
		xyz t1= new xyz();
		t1.run();
		
		for (i=0;i<=5;i++)
		{
			System.out.println("bhole")
		}
	}
}