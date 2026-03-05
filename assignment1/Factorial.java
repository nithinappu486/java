//Write a program with a method that calculates the factorial of a number using recursion.


package Assignment1;
import java.util.*;
public class Factorial 
{
	static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=fact(n);
		System.out.println("Factorial of "+n+" is: "+result);
		sc.close();
	}
}
