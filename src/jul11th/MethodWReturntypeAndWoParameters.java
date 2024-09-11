package jul11th;

import java.util.Scanner;

public class MethodWReturntypeAndWoParameters {

	public static void main(String[] args) 
	{
		MethodWReturntypeAndWoParameters obj=new MethodWReturntypeAndWoParameters();
		double z=obj.SI();
		System.out.println("Simple Interest is "+z);
		

	}
	public double SI()
	{
		System.out.println("Enter Principal");
		Scanner SC=new Scanner(System.in);
		int Pr=SC.nextInt();
		
		System.out.println("Enter Term");
		Scanner SC1=new Scanner(System.in);
		int Te=SC1.nextInt();
		
		System.out.println("Enter Rate of Interest");
		Scanner SC2=new Scanner(System.in);
		double Ra=SC2.nextDouble();
				
		double sum=(Pr*Te*Ra)/100;
		return sum;
				
	}

}
