package combination;
import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
		System.out.println("Enter the number alphabets in your name");
		Scanner sc=new Scanner(System.in);
		int n,prod=1;
		n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			prod=prod*i;
		}
		System.out.println("The number of combination is "+prod);
	}

}
