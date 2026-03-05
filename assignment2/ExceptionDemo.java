package Assignment2.Modue2;

import java.io.*;

class ExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileReader f=new FileReader("test.txt");
		}
		catch(IOException e)
		{
			System.out.println("Checked Exception handled");
		}
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Unchecked Exception handled");
		}
	}
}