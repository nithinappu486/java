package Assignment2.Modue2;

class LifeCycle extends Thread
{
	public void run()
	{
		System.out.println("Thread running");
	}

	public static void main(String[] args)	
	{
		LifeCycle t=new LifeCycle();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(t.getState());
	}
}