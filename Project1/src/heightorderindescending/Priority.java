package heightorderindescending;

import java.util.Scanner;

public class Priority {

	public static void main(String[] args) {
		System.out.println("Enter the Students Mark Here:");
		Scanner sc=new Scanner(System.in);
		int n;
		
		n=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<n;i++)
		{
			double temp=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
					temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

	}


