import java.util.*;
public class AlpDigSpe
{
	public static void main(String [] args)
	{
	Scanner s= new Scanner(System.in);
	System.out.println("enter the item:");
	char item= s.next().charAt(0);
	if(item>=65 && item<=90 || item>=97 && item<=122)
	{
		System.out.println("alphabetic");
	}	
	else if(item>=48 && item<=57)
	{
		System.out.println("digit");
	}
	else
	{
		System.out.println"special character");
	}
}
