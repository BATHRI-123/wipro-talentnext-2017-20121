import java.io.*;
import java.util.*;
public class Divisible
{
  public static void main(String args[])
  {
    int i;
    {
      for(i=1;i<=5;i++)
      {
        if(i%2==0 && i%3==0 && i%5==0)
        {
          System.out.println(i);
        }
      }
    }
  }
} 