// Code for Practicum 16 (Short-Circuit Evaluation)
// (TO UPDATE)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numerator, denominator;

    System.out.println("Enter numerator <space> denominator: ");
    numerator = input.nextInt();
    denominator = input.nextInt();

    if (denominator !=0)
      System.out.println("Input is valid");
    else
      System.out.println("** Invalid Denominator of 0 enter new denominator greater than 0");

    denominator = input.nextInt();
      

    if(numerator / denominator < 1)

      System.out.println(numerator + "/" + denominator +
                         " is a proper fraction");
    else if(numerator / denominator >= 1)
        System.out.println(numerator + "/" + denominator +
                          " is an improper fraction");
    
      

  }
}
