//Write a program to demonstrate the difference between method overloading and method overriding

package Assignment1;
class Animal1
{
	void sound()
	{
     System.out.println("Animal makes a sound");
	}
	void sound(String name)
	{
     System.out.println("Animal name is: " + name);
	}
}
public class Dog1 extends Animal1
{
	void sound()
	{
     System.out.println("Dog barks");
	}
	public static void main(String[] args)
	{
		Animal1 a = new Animal1();
	    a.sound();
	    a.sound("Tommy");
	    Animal1 d = new Dog1();
	    d.sound();
	}
}