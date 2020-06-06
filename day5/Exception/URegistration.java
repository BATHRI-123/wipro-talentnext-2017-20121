import java.util.*;
import java.io.*;
public class URegistration
{	
	public void registerU(String Uname, String UCountry) throws InvalidCountryException 
	{
		if (!UCountry.equals("India"))
		{
			throw new InvalidCountryException();
		}
		else
		{
			System.out.println("U registration done successfully");
		}
	}
	public static void main(String[] args) 
	{
		URegistration registration = new URegistration();
		try 
		{
			registration.registerU("Mickey", "US");
		} 
		catch (InvalidCountryException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
