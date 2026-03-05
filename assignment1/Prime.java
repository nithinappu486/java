//Write a program to check if a number is prime or not.

package Assignment1;
import java.util.*;
public class Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		if(n<=1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("the number is prime");
			}
			else
			{
				System.out.println("the number is not prime");
			}
		}
		sc.close();
			
	}
}
