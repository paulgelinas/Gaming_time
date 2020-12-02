
import java.util.Scanner;

public class going_mad_libs
{
   public static void main(String[] args)
   {
    Scanner myObj = new Scanner(System.in);
    System.out.println('\u000C');
    Scanner inputScanner = new Scanner(System.in);
    
    System.out.println("Give me an adjective: ");
    String Adjective1 = myObj.nextLine();
    
    System.out.println("Give me an adverb: ");
    String Adverb1 = myObj.nextLine();
    
    System.out.println("Give me a verb: ");
    String Verb1 = myObj.nextLine();
    
    System.out.println("Give me a noun: ");
    String Noun1 = myObj.nextLine();
    
    System.out.println("Give me another adjective: ");
    String Adjective2 = myObj.nextLine();
    
    System.out.println("Give me a pronoun: ");
    String Pronoun1 = myObj.nextLine();
    
    System.out.println("Give me a verb: ");
    String Verb2 = myObj.nextLine();
    
    System.out.println("Give me one last adjective: ");
    String Adjective3 = myObj.nextLine();
    
    System.out.println("the morning was dark and " + Adjective1 + ". ");
    System.out.println("It was so " + Adverb1 + " that I could see my breath cloud in front of me. ");
    System.out.println("I decided to go for an early morning " + Verb1 + ". ");
    System.out.println("On my " + Verb1 + " I saw a iced over " + Noun1 + "and thought I'd go sit by it. ");
    System.out.println("As soon as I reached the " + Noun1 + " I decided to throw rocks at it, they " + Adjective2 + " the ice. ");
    System.out.println("Soon after that my friend came and " + Pronoun1 + "said that " + Pronoun1 + " had never seen something so beautiful. ");
    System.out.println("After my chaotic morning I decided it was time to " + Verb2 + " home and have a nice cup of hot coco. ");
    System.out.println("After I arived at home I snuggled into my " + Adjective3 + "bed and slipped off into a lovely nap.");
   }
}
