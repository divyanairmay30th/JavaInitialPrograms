package jul11th;

import java.util.Scanner;

public class MethodWithoutReturntypeAndParameters {

	public static void main(String[] args) 
	{
		MethodWithoutReturntypeAndParameters obj= new MethodWithoutReturntypeAndParameters();
		obj.SimpleInterest();
	}
	public void SimpleInterest()
	{
		System.out.println("Enter Principal Amount");
		Scanner Principal=new Scanner(System.in);
		int P=Principal.nextInt();
		//Principal.close();
		
		System.out.println("Enter Term");
		Scanner Term=new Scanner(System.in);
		int T=Term.nextInt();
		//Term.close();
		
		System.out.println("Enter Rate of Interest");
		Scanner Rate=new Scanner(System.in);
		double R=Rate.nextDouble();
		//Rate.close();
		double Sum=(P*T*R)/100;
		System.out.println("Simple Interest is "+Sum);
		
	}

}
