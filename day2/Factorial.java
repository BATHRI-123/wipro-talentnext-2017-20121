import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
	int i,n,fact=1;
	Scanner s = newScanner (System.in);
	System.out.println("enter the number");
	n = s.nextInt();
	for(i=0;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	}
}