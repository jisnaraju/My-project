package project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String name;
		String age;
		String degree;
		String branch;
		String contactNumber;
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		Resume obj=new Resume();
		System.out.println("Enter your Name ");
		name=br.readLine();
		obj.setName(name);
		System.out.println("Enter your age");
		age=br.readLine();
		obj.setAge(age);
		System.out.println("Enter your Degree");
		degree=br.readLine();
		obj.setDegree(degree);
		System.out.println("Enter your Branch");
		branch=br.readLine();
		obj.setBranch(branch);
		System.out.println("Enter your Contact Number");
		contactNumber=br.readLine();
		obj.setContactNumber(contactNumber);
		obj.data();
		

	}

}
