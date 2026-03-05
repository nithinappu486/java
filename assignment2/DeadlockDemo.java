package Assignment2.Modue2;

class DeadlockDemo
{
	static final Object o1=new Object();
	static final Object o2=new Object();
	public static void main(String[] args)
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				synchronized(o1)
				{
					System.out.println("Thread1 locked o1");
					try{Thread.sleep(100);}catch(Exception e){}
					synchronized(o2)
					{
						System.out.println("Thread1 locked o2");
					}
				}
			}
		};

		Thread t2=new Thread()
		{
			public void run()
			{
				synchronized(o2)	
				{
					System.out.println("Thread2 locked o2");
					try{Thread.sleep(100);}catch(Exception e){}
					synchronized(o1)
					{
						System.out.println("Thread2 locked o1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
