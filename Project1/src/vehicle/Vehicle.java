package vehicle;
import java.util.Scanner;
public class Vehicle {

	public static void main(String[] args) {
		System.out.println("Enter the number of vehicles ");
		 int n,i,count=0,count1=0,val;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 System.out.println("Enter the fare collected for each vehicles");
		 int[] arr=new int[n];
			for( i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			for( i=0;i<n;i++)
			{
				if(arr[i]>50)
					count++;
				else if(arr[i]==0)
					count1++;
			}
			val=count+count1;
			System.out.println("Number of heavy vehicles "+count+" and the number of light weight vehicles is "+(n-val));
			
		
	}

}
