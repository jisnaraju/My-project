package exam;
import java.util.Scanner;
public class Retest {
public static void main(String[] args) {
	System.out.println("Enter the No of Students: ");
	Scanner sc=new Scanner(System.in);
	int n,count=0;
	n=sc.nextInt();
	System.out.println("Enter the marks of students ");
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(arr[i]<50)
			count++;
	}	
	System.out.println("Number of students appearing for retest is "+count);
	}

}
