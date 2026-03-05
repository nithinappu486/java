package Assignment2;

class ReverseString 
{
	public static void main(String[] args)
	{
		String s="Hello";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
}