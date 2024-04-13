import java.util.Scanner;

public class InfiniteNumber{

  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

     int largest = Integer.MIN_VALUE;
     int smallest = Integer.MAX_VALUE;

    boolean firstIteration = true;

    while(true) {
      System.out.print("Enter a number (or 'done' to finish):");
       if(scanner.hasNextInt()) {
        int num = scanner.nextInt();

       if (firstIteration) {
         largest = num;
         smallest = num;
         firstIteration = false;
          }
      else {
       if (num > largest) {
          largest = num;
           }
       if (num < smallest) {
           smallest = num;
            }
          }
         }
      else {
         String input = scanner.next();
         if (input.equals("done")) {
             break;
           }
        else {
          System.out.println("Please enter a number or 'done' to finish");
            }

        }
       }

     if (!firstIteration) {
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
            }
     else {
        System.out.println("No numbers were entered.");
          }
   }


}