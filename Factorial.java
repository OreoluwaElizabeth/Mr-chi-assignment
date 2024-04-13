import java.util.Scanner;

  public class Factorial{

    public static void main(String [] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter a non-negative integer: ");
      int num = input.nextInt();

     if (num < 0) {
       System.out.println("Error message: can't calculate negative value");
         }
     else {
       long factorial = calculateFactorial(num);

       System.out.println(" The factorial of " + num + " is: " + factorial);
        }
      }


   public static long calculateFactorial(int n) {
     if (n == 0) {
         return 1;
            }
       else {
         return (long) n * calculateFactorial(n - 1);
           }
      }


}

