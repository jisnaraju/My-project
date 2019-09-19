package leapyear;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter a year ");
		 int n;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 if(n%400==0)
			 System.out.println("It is a leap year");
		 else if(n%100 !=0 && n%4==0)
			 System.out.println("It is a leap year");
		 else
			 System.out.println("It is not a leap year");

	}

}
