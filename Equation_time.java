
import java.util.Scanner;
public class Equation_time
{
   public static void main(String[] args)
   {
       System.out.print("\u000C");
       
       Scanner inputScanner = new Scanner(System.in);
       int xValue;
       int yValue;
       int aValue;
       int bValue;
       int R;
       System.out.println("solve 1*x+7*y+3*a+13*b=R");
       System.out.println("can I have an x value? ");
       xValue = inputScanner.nextInt();
       
       System.out.println("how about a y value? ");
       yValue = inputScanner.nextInt();
       
       System.out.println("an a value? ");
       aValue = inputScanner.nextInt();
       
       System.out.println("and last but not least a b value");
       bValue = inputScanner.nextInt();
       R = 1*xValue+7*yValue+3*aValue+13*bValue;
       System.out.println("the result is " + R + ".");
    }
}