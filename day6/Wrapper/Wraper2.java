import java.io.*;
import java.util.*;
public class Wraper2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		sc.close();
	}
}