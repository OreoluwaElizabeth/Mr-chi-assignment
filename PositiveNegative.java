import java.util.Scanner;

  public class PositiveNegative{

    public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);

      int positiveCount = 0;
      int negativeCount = 0;
      int zeroCount = 0;

     String input;

    do {
      System.out.print("Enter a number (or 'done' to finish): ");
      input = scanner.nextLine();

    if (!input.equalsIgnoreCase("done")) {
       int num = Integer.parseInt(input);

      if (num > 0) {
           positiveCount++;
            }
       else if (num < 0) {
          negativeCount++;
            }
       else {
         zeroCount++;
          }
       }
      }
     while (!input.equalsIgnoreCase("done"));

    System.out.println("Count of positive numbers entered: " + positiveCount);
    System.out.println("Count of negative numbers entered: " + negativeCount);
    System.out.println("Count of zero numbers entered: " + zeroCount);
     



}


}