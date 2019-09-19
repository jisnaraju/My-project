package armstrongNumber;
import java.util.Scanner;
import java.util.*;
public class Armstrongnumber {
public static void main(String[] args)  {
		int n;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n,sum=0,r;
		while(n!=0)
		{
			r=n%10;
			int power=(int) (Math.pow(r,3));
			sum=sum+power;
			n=n/10;
		}
		if(num==sum)
		System.out.println("The given number is amstrong");
		else
			System.out.println("The given number is not amstrong");
}
}
