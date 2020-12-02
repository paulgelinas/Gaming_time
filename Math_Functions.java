
import java.util.Scanner;
public class Math_Functions
{
  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println('\u000C');
    Scanner inputScanner = new Scanner(System.in);
    
    System.out.println("so what kinda math do you need? 1 for max 2 for min 3 for square root 4 for absolute 5 for random numbers and 6 for pow.");
    double mathType = myObj.nextDouble();
    
    if (mathType == 1)
    {
     System.out.println("well what are the 2 numbers you want to compare?");
     double X = myObj.nextDouble();
     double Y = myObj.nextDouble();
     Math.max(X,Y);
     System.out.println("Well the biggest number is: ");  
     System.out.print(Math.max(X,Y));
    }
    if (mathType == 2)
    {
     System.out.println("Well what are the 2 numbers you want to comare?");
     double A = myObj.nextDouble();   
     double B = myObj.nextDouble();
     System.out.println("well I suppose the smallest number is: ");
     System.out.print(Math.min(A,B));
     
    }
    if (mathType == 3)
    {
       System.out.println("Awesome, so what's the number you want the square root of?");
       double M = myObj.nextDouble();
       System.out.println("Well that number's square root is: ");
       System.out.print(Math.sqrt(M));
    }
    if (mathType == 4)
    {
        System.out.println("Good choice, so what's the absolute value you want?");
        double N = myObj.nextDouble();
        System.out.println("Well that number's absolute value is ");
        System.out.print(Math.abs(N));
    }
    if (mathType == 5)
    {
     System.out.println("Nice one, well your random number is...: ");
     System.out.print(Math.random());
    }
    if (mathType == 6)
    {
     System.out.println("Alright let's see if I can remember this one");
     System.out.println("Okay so what's Z?");
     double Z = myObj.nextDouble();
     System.out.println("Epic, so what's V?");
     double V = myObj.nextDouble();
     System.out.println("Awesome, well that comes out too ");
     Math.pow(Z,V);
    }
  }
}