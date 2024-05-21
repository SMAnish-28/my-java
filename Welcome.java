import java.lang.*;
import java.util.*;

public class Welcome
{
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name;
		name = s.nextLine();
		System.out.println("Welcome, " + name);
	}
}