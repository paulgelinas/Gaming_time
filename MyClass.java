
import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Result");

    String Math = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + Math);  // Output user input
  }
}