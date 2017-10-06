import java.util.*;
public class exp3 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number of strings");
		n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the Strings");
		for(i=0;i<n;i++)
			arr[i]=s.next();
		System.out.println("The enterd string are ");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("strings after sorting are");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
	}
}
		
		
		