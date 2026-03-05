package Assignment2;

class StaticDemo
{
	static int count=0;
	static void show(){
	System.out.println("Count: "+count);
}
public static void main(String[] args)
{
	StaticDemo a=new StaticDemo();
	StaticDemo b=new StaticDemo();
	count++;
	show();
}
}