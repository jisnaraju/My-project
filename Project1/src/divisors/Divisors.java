package divisors;
import java.util.Scanner;
public class Divisors {
public static void main(String[] args) {
    System.out.println("Enter a number");	
    int n,sum=0;
    
    Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("The divisors of the number are ");
	 for(int i=1;i<n;i++)
	 {
		if(n%i==0)
		{
			System.out.println(i+ " ");
			sum=sum+i;
		}
	 }
	 System.out.println("The sum of the divisors are "+sum);
	 if(n==sum)
		 System.out.println("It is a perfect number");
	 else
		 System.out.println("It is not a perfect number");
	}

}
