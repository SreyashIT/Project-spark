import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		original=s.nextLine();
		int l=original.length();
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("The given string is pallindrome");
		else
			System.out.println("The given string is not pallindrome");
	}
}