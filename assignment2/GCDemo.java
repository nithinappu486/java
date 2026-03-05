package Assignment2;

class GCDemo
{
	public void finalize()	
	{
		System.out.println("Object destroyed");
	}
	public static void main(String[] args)
	{
		GCDemo obj1=new GCDemo();
		GCDemo obj2=new GCDemo();
		obj1=null;
		obj2=null;
		System.gc();
	}
}
