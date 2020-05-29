import java.util.*;
import java.lang.*;
import java.io.*;
class Patient1
{
    String name;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double CobHealth()
    {          
        return ((weight/(height*height))*703);
    }   
}
class Patient2
{
    public static void main (String[] args)
    {
        Patient1 p=new Patient1(75,156);
        System.out.println("The BMI:"+p.CobHealth());
    }
}