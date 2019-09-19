package fouls;
import java.util.Scanner;
public class Fouls {
public static void main(String[] args) {
	System.out.println("Enter the number of players ");
	 int n,temp,i;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 System.out.println("Enter the number of fouls made by each player");
	 int[] arr=new int[n];
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		temp=arr[0];
		for( i=1;i<n;i++)
		{
			if(arr[i]<temp)
				temp=arr[i];
		}
		for( i=1;i<=n;i++)
		{
			if(arr[i]==temp)
			{
				 //index=i;
				break;
			}
			
		}
		
		System.out.println("The eligible player is player no: "+(i+1) +" "+ temp+"(fouls)");

}
}
