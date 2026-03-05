//Write a program to find the sum of all even numbers between 1 and 100 using a while loop.

package Assignment1;

public class Even
{
	public static void main(String[] args)
	{
		int n=1,sum=0;
		while(n<=100)
		{
			if(n%2==0)
			{
				sum+=n;
			}
			n++;
		}
		System.out.println("Sum of even numbers from 1 to 100 is:"+sum);
	}
}
