package Assignment2.Modue2;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread using Thread class");
	}
}
class RunnableDemo implements Runnable
{
	public void run()
	{
		System.out.println("Thread using Runnable interface");
	}

	public static void main(String[] args)
	{
		MyThread t1=new MyThread();
		RunnableDemo r=new RunnableDemo();
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}
