import java.lang.*;
import java.util.*;

public class bin2dec
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        // useRadix to convert binary to decimal with index value '2'
        s.useRadix(2);
        System.out.println("Enter Binary Number: ");
        int x;
        x = s.nextInt();
        System.out.println("Converted Decimal Value: " + x);
    }
}