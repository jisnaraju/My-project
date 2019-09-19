package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("Enter the Students Mark Here:");
		Scanner sc=new Scanner(System.in);
		int n,sum=0,average;
		
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		average=sum/n;
		System.out.println("The average is "+average);
	}

}
