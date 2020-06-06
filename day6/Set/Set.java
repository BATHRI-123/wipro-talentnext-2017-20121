import java.io.*;
import java.util.*;
public class Set 
{
	public static void main(String[] args) 
	{
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Canada");
		countries.saveCountryNames("Germany");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}