import java.util.*;
public class Reverse
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    int n=s.nextInt();
    int r=0,d;
    while(n!= 0) 
    {
        d= n % 10;
        r= r * 10 + d;
        n /= 10;
    }
    System.out.println("Reversed Number: " + rev);
  }
}