import java.util.*;
 public class perfectSquare
{ 

    static boolean PerfectSquare(double x)  
    {  
	double sq = Math.sqrt(x); 
	return ((sq - Math.floor(sq)) == 0); 
    } 
 
    public static void main(String[] args)  
    { 
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	double num = scanner.nextDouble(); 
	scanner.close();

	if (PerfectSquare(num)) 
		System.out.print(num+ " is a perfect square number"); 
	else
		System.out.print(num+ " is not a perfect square number"); 
    } 
}