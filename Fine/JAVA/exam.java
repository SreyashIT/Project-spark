import java.util.*;
class exam
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m,n,i,j,sum=0;
		System.out.println("Enter the dimensions of the matrix\n");
		m=s.nextInt();
		n=s.nextInt();
		if(m==n)
		{
			int arr[][]=new int[m][n];
			System.out.println("Enter the elements");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					arr[i][j]=s.nextInt();
				}
			}
			
			
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					if(i==j)
					{
						sum=sum+arr[i][j];
					}
				}
			}

			j=n-1;
			for(i=0;i<m;i++)
			{
				if(j>=0)
				{
					sum=sum+arr[i][j];
					j--;
				}
			}
			System.out.print("The sum of both the diagonals is "+sum);
	}
		else
			System.out.println("Can not be processed");
	}
}	
			
		
			