package Assignment5;

import java.util.Scanner;

public class AadharTest {

	public static void main(String[] args)
	{
		
		System.out.println((Math.round(1.2323229)*10000));
		Aadhar obj1=new Aadhar(); 
		//obj1.setAadhar("3343dfdfs");
		System.out.println("Enter Pan number");
		Scanner s1=new Scanner(System.in);
		String x1=s1.next();
		obj1.setAadhar(x1);
		
		System.out.println("Enter Passport number");
		Scanner s2=new Scanner(System.in);
		String x2=s2.next();
		obj1.setAadhar(x2);
		
		System.out.println("Enter Voteri");
		Scanner s3=new Scanner(System.in);
		String x3=s3.next();
		obj1.setAadhar(x3);
		
		
		obj1.getAadhar();
		

	}

}
