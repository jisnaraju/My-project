package bowls;
import java.util.Scanner;
public class Over {
public static void main(String[] args) {
		System.out.println("Enter the number of bowlers ");
		 int n,count=0;
		 double sum=0,average;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 System.out.println("Enter the runs conceded by the bowlers ");
		 int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the number of balls for each bowler");
			int[] arr1=new int[n];
			for(int i=0;i<n;i++)
			{
				arr1[i]=sc.nextInt();
			}
		
			for(int i=0;i<n;i++)
			{
				arr1[i]=arr1[i]/6;
			}
			double[] arr2=new double[n];
			for(int i=0;i<n;i++)
			{
				arr2[i]=(float)(arr[i])/(float)arr1[i];
				
			}
			System.out.println("Economy of the bowlers is");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr2[i]);
			}
			for(int i=0;i<n;i++)
			{
				sum=sum+arr2[i];
			}
			average=sum/n;
			System.out.println("The overall economy of the teanm is "+average);
			for(int i=0;i<n;i++)
			{
				if(arr2[i]<average)
					count++;	
			}
			System.out.println("The number of bowlers eligible are "+count);
	}

}
