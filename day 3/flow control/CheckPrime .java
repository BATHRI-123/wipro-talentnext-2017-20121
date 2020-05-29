import java.util.*;
public class CheckPrime 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        flag=0;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println(n + " is a prime number.");
        }
        else
        {
            System.out.println(n + " is not a prime number.");
        }
    }
}