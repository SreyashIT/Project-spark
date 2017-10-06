import java.util.*;
class palin
{
	public static void main(String arg[])
	{
		char a[10],dup[10];
		int i,j=0,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of letters");
		n=s.nextInt();
		System.out.println("enter the string  ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextChar(10);
		
		}
		for(i=0;i<n;i++)
		{
			dup[j]=a[i];
			j++;
		}
		j='/0';
		for(i=0;j;i!=j;i++;j--)
		{
			if(a[i]!=a[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("it is not a pallindrome  ");	
		else
			System.out.println("it is a pallindrome  ");	
	}
	
}
	
}