//Write a program to print the multiplication table of a given number using a for loop.
package Assignment1;

import java.util.*;
public class Multiplication 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
		sc.close();
	}
}
