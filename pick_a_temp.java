
import java.util.Scanner;

public class pick_a_temp
{
   public static void main(String[] args)
   {
    Scanner myObj = new Scanner(System.in);
    System.out.println('\u000C');
    Scanner inputScanner = new Scanner(System.in);
    float A = 32;
    float B = 5;
    float C = 9;
    int Temp;
    
    System.out.println("is the temperature in Fahrenheit or Celsius?");
    System.out.println("type 1 for Fahrenheit and 2 for Celsius");
    Temp = inputScanner.nextInt();
    
    if (Temp == 1) //Fahrenheit to Celsius 
    {   
     System.out.println("What temperature is it?");
     double TempA = myObj.nextDouble();
     System.out.println("Well that means the tempurature in celsius is about ");
     double CelsiusTemp = (((TempA - A) * B) / C); 
     System.out.print(CelsiusTemp + " degrees.");
    }
    
    else if (Temp == 2) //Celsius to Fahreneit 
    {
     System.out.println("What temperature is it?");
     double TempB = myObj.nextDouble();
     System.out.println("Well that means the tempurature in Fahrenheit is about ");
     double FahrenheitTemp = (((TempB * C) / B) + A);
     System.out.print(FahrenheitTemp + " degees.");
    }
    
    else 
    {
        System.out.println("that wasn't one of the options silly");
    }
    
   }
}
