package jun17th;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation e1=new Encapsulation();
		e1.getname("Divya");
		e1.setname("Divya Nair");
		e1.setX(10);
		
		System.out.println("Balance is "+ e1.getbalance(123));
		e1.setbalance(200);
		

	}

}
