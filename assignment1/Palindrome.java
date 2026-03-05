//Write a program with a method that checks whether a given string is a palindrome.


package Assignment1;
import java.util.*;
public class Palindrome 
{
	static boolean isPalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String s=sc.nextLine();
		if(isPalindrome(s))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		sc.close();
	}
}
