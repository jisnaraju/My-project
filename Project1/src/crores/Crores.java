package crores;
import java.util.Scanner;
public class Crores {
public static void main(String[] args) {
	System.out.println("Enter the number of applications ");
	 int n,temp;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 System.out.println("Enter the amount(in crores)");
	 int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		temp=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>temp)
				temp=arr[i];
		}
		System.out.println("The winning bid is "+temp+" crores");
		}

	}

