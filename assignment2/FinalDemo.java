package Assignment2;

final class A
{
	final int x=10;
	final void show()
	{
		System.out.println("Final method");
	}
}

class FinalDemo
{
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.x);
		obj.show();
	}
}