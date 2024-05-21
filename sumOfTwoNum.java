import java.lang.*;
import java.util.*;

class sumOfTwoNum
{
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);
		int a, b, sum;	
		System.out.println("Enter two numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		sum = a + b;
		System.out.println("Sum is: " + sum);
	}
}