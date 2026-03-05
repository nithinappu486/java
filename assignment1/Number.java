//Write a program to check if a given number is positive, negative, or zero.


package Assignment1;
import java.util.*;
public class Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("The number is zero!!");
		}
		else if(n>0)
		{
			System.out.println("The number is positive!!");
		}
		else
		{
			System.out.println("The number is negative");
		}
		sc.close();
	}
}
