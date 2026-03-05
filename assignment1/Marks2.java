//Write a program that takes a student's marks as input and prints the corresponding grade (A, B, C, D, or F) using a switch statement.


package Assignment1;
import java.util.*;
public class Marks2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int m=sc.nextInt();
		int grade;
		if(m<0 || m>100)
		{
			grade=0;
		}
		else if(m>85)
		{
			grade=1;
		}
		else if(m>70)
		{
			grade=2;
		}
		else if(m>55)
		{
			grade=3;
		}
		else if(m>40)
		{
			grade=4;
		}
		else
		{
			grade=5;
		}
		switch(grade)
		{
		case 1:
			System.out.println("Grade A");
			break;
		case 2:
			System.out.println("Grade B");
			break;
		case 3:
			System.out.println("Grade C");
			break;
		case 4:
			System.out.println("Grade D");
			break;
		case 5:
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Invalid Marks.");
		}
		sc.close();
	}
}
