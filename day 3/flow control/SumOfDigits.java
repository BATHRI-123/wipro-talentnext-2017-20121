import java.util.*;
public class SumOfDigits 
{
  public static void main(String args[])
  {
    int sum=0,d;
    Scanner s=new Scanner(System.in);
    System.out.println("enter number :");
    int n=s.nextInt();
    while(n>0)
    {
      d=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println(sum);
 }
}