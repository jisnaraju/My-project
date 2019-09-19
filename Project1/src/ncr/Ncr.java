package ncr;
import java.util.Scanner;
public class Ncr {
public static void main(String[] args) {
	System.out.println("Enter the value of n");
	int n,r;
	 long fact=1,fact1=1,fact2=1;
	 long total;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 System.out.println("Enter the value of r");
	 r=sc.nextInt();
	 int nr=n-r;
	 for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	 for(int i=1;i<=r;i++)
		{
			fact1=(fact1)*i;
		}
	 for(int i=1;i<=nr;i++)
		{
			fact2=(fact2)*i;
		}
	 
	 total=fact/((fact1)*(fact2));
	 System.out.println("The NCR factor for given values is"+ total);
	 
	 
		
	}

}
