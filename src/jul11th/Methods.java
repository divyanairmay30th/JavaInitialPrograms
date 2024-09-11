package jul11th;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner inp = new Scanner(System.in);
			int n=inp.nextInt();
			int resu=(n*2)+1;
			System.out.println("Value is "+ resu);
			
			
			MethodWithoutReturntypeAndParameters obj=new MethodWithoutReturntypeAndParameters();
			obj.SimpleInterest();
			
	}
	

}
