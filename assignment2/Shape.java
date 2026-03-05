package Assignment2;

abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	double r=5;
	void area()
	{
		double a=3.14*r*r;
		System.out.println("Area of circle: "+a);
	}
}
class Rectangle extends Shape
{
	int l=4,b=6;
	void area()
	{
		int a=l*b;
		System.out.println("Area of Rectangle: "+a);
	}
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.area();
		Rectangle r=new Rectangle();
	}
}
