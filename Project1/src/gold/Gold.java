package gold;
import java.util.Scanner;
public class Gold {

	public static void main(String[] args) {
		System.out.println("Enter the kgs of gold ");
		 int n,total,val1=0;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 total=n;
		 while(n>5)
		 {
			 n=n/5;
			 total=total+n;
		 }
		 System.out.println(total);
		 //val=n/5;
		 //val1=val/5;
		 //total=num+val+val1;
		// System.out.println("Number of Sculptors can be made is "+total);
		
	}

}
