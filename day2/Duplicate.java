public class Duplicate
{
	public static void main(String[] args)
	{
	Scanner s = newScanner(System.in);
	System.out.println("enter the string");
	String input = s.nextLine();
        String output = new String();
	for (int i = 0; i < input.length(); i++)
	{
 		for (int j = 0; j < output.length(); j++)
		{
                	if (input.charAt(i) != output.charAt(j))
			{
                    		output = output + input.charAt(i);
                	}
            	}
        }
	System.out.println(output);
	}
}