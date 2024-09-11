package Assignment5;

import java.util.Scanner;

public class Aadhar
{
	private String panN,paN,voN;
	
	public void setAadhar(String panN) 
	{
		
		
		this.panN = panN;	
	}
	public void setAadhar(String panN,String paN) 
	{

		this.paN = paN;	
	}
	public void setAadhar(String panN,String paN,String voN) 
	{

		this.voN = voN;	
	}

	


	public void getAadhar() 
	{
		String aadhar="122345676545";
		System.out.println("Aadhar number generated "+aadhar);
		System.out.println((int)Math.round(2.2323232432423423)*10000);
	}

	

}
