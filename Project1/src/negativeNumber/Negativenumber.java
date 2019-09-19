package negativeNumber;
import java.util.Scanner;
public class Negativenumber {
public static void main(String[] args) {
	//System.out.println("Enter a number");
	 int n,sum=0;
	 Scanner sc=new Scanner(System.in);
	 do
	{
		System.out.println("Enter a number");
		n=sc.nextInt();
	}while(n<0);
	for(int i=n;i>0;i--)
	 {
		 sum=sum+i;
	 }

	System.out.println(sum);
	}
}
