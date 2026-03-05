//Write a program to find the largest of three numbers using if-else statements

package Assignment1;
import java.util.*;
public class Largest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		System.out.println("Enter the Third number:");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b<a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		sc.close();
	}
}
