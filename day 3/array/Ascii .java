import java.util.*;
public class Ascii 
{
    public static void main(String []args)
    {
        String str=null;
        for(int i=65;i<=122;i++)
        {
            str=Character.toString((char)i);
            System.out.print(str + " ");
        }
    }    
}