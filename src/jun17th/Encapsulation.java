package jun17th;

public class Encapsulation
{

	private String name;
	public void getname(String x)
	{
		name=x;
		System.out.println(name);
	}
	public void setname(String y)
	{
		name=y;
		System.out.println("Update name : "+name);
	}
	
	private int x,y;
	public int getX()
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
		System.out.println(x);
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	private double balance=10000;
	public double getbalance(int p)
	{
		if(p==1234)
		{
		return balance;
		}
		else
		{
			return 0;
		}
		
	}
	public void setbalance(double y)
	{
	double bal=(balance+y);
	System.out.println("Final Amount is "+ bal);
	}

	
	
	
}
