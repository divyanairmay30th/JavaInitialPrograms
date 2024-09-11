package july10th;

public class Sample 
{
	String car="Tata Nexon";
    static String name="Divya";

	public static void main(String[] args) {
		String s="Hai"; //Local Variable
		System.out.println("This is local vairable "+s);
		
		Sample obj=new Sample(); //Instance Variable
		System.out.println("This is instance variable " +obj.car);
		
		System.out.println("This is Static Variable " + Sample.name); //Static Variable
	
		int a=10;
		int b=20;
		System.out.println("Mulitplication of 2 number is "+ a*b);
			

	}
	public void m1()
	{
		int y=20;
		System.out.println(y);
	}

}
