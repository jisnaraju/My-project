package fibanocci;
import java.util.Scanner;
public class Fibanocci {
public static void main(String[] args) {
	System.out.println("Enter a number ");
		 int n,c;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 int a=0,b=1;
		 System.out.print(a+" ");
		 System.out.println(b);
		 for(int i=0;i<=n;i++)
		 {
			 c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
		}
		 
	}

}
