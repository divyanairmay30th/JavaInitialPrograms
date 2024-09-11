package jul11th;

import java.util.Scanner;

public class MethodWithReturntypeAndParameters {

	public static void main(String[] args)
	{
		
		System.out.println("Enter Principal");
		Scanner SC = new Scanner(System.in);
		int Pr=SC.nextInt();
		
		System.out.println("Enter Term");
		Scanner Sca = new Scanner(System.in);
		int Te=Sca.nextInt();
		
		
		System.out.println("Enter Rate of Interest");
		Scanner Scan = new Scanner(System.in);
		//int Ra=Scan.nextInt();
		double Ra=Scan.nextDouble();
		
		MethodWithReturntypeAndParameters obj = new MethodWithReturntypeAndParameters();
		double SI=obj.SimpleInterest(Pr, Te, Ra);
		System.out.println("Simple Interest is "+SI);
	}
	public double SimpleInterest(int P,int T,double R)
	{
		double res=(P*T*R)/100;
		return res;
	}

}
