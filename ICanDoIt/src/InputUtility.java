import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputUtility {

	public static String input()
	{
		try{
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return null;		
		}
		
	}
}
