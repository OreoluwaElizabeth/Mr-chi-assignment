import java.util.Scanner;

 public class SumDigits {
   public static void main(String [] args) {
     Scanner scanner = new Scanner(System.in);

      System.out.print("Enter an integer between 0 and 1000: ");
      int number = scanner.nextInt();

     if (number < 0 || number > 1000) {
        System.out.println("Enter a valid  integer between 0 and 1000. ");
         }
     else {
       int sum = 0;
       int remainingNumber = number;

     while (remainingNumber != 0) {
       sum += remainingNumber % 10;
       remainingNumber /= 10;
        }
     System.out.println("The sum of all digits in the integer " + number + " is: " + sum);

   }
    


}



}