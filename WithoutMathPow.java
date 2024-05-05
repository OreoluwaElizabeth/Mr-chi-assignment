import java.util.Scanner;

public class WithoutMathPow {

  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(" Enter base number: ");
    double base = scanner.nextDouble ();

    System.out.print(" Enter exponent: ");
    int exponent = scanner.nextInt();

    double result = calculatePower(base, exponent);

    System.out.println(base + " raised to the power of " + exponent + " is: " + result);

  }

   public static double calculatePower(double base, int exponent) { 
     double result = 1;

    if (exponent < 0) {
       base = 1 / base;
       exponent = -exponent;
        }

    for (int i = 0; i < exponent; i++) {
         result *= base;
       }

     return result;
     


}

}