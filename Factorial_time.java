
import java.util.Scanner;
public class Factorial_time
{
    public static void main(String[] args)
    {
     Scanner myObj = new Scanner(System.in);
     System.out.println('\u000C');
     Scanner inputScanner = new Scanner(System.in);
     System.out.println("so what number do you wannt the factorial of?");
     int A, fact = 1;
     int number = inputScanner.nextInt();
     for(A=1;A<=number;A++)
     fact=fact*A;  
     System.out.println("Well I suppose that means the factorial of " + A + " is " + fact + ".");
    }
}