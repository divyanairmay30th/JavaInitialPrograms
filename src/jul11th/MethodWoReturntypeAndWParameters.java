package jul11th;

import java.util.Scanner;

public class MethodWoReturntypeAndWParameters {

	public static void main(String[] args) 
	{
     System.out.println("Enter Principal");
     Scanner Sc=new Scanner(System.in);
     int Pr=Sc.nextInt();
     
     System.out.println("Enter Term");
     Scanner Sc1=new Scanner(System.in);
     int Te=Sc1.nextInt();
     
     System.out.println("Enter RateofInterest");
     Scanner Sc2=new Scanner(System.in);
     double Ra=Sc2.nextDouble();
     
     MethodWoReturntypeAndWParameters obj=new MethodWoReturntypeAndWParameters();
     obj.SI(Pr, Te, Ra);
	}

	public void SI(int P,int T,double R)
	{
		double sum=(P*T*R)/100;
		System.out.println("Simple Interest is "+ sum);
	}
}
