public class Kata {

   public static boolean isEven(int num) {
       if (num % 2 == 0) {
          return true;
            }
       else {
          return false;
           }
        }


   public static boolean isPrimeNumber(int num) {
       if (num <= 1) {
          return false;
            }
       for (int i = 2; i * i <= num; i++) {
           if (number % i == 0) {
               return false;
                 }
           else {
              return true;
                   }
                 }
               }

   public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return Math.abs(result);
          }


   public static float divide(int num1, int num2) {
       if (num2 == 0) {
           return 0;
            }

       float quotient = (float) num1 / num2;
       quotient = Math.round(quotient * 100) / 100f;

       return quotient;
         }

   public static int factorOf(int number) {
       int counter = 0;

       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
              counter++;
                 }
               }
        return counter;
           }

    public static boolean isSquare(int num) {
        if (num < 0) {
            return false;
             }
        double squareRoot = Math.sqrt(num);

        if (squareRoot % 1 == 0) {
            return true;
               }
        else {
            return false;
              }
            }

   public static boolean isPalindrome(int num) {
       String numString = String.valueOf(num);

       if (numString.length() != 5) {
          return false;
            }

       for (int i = 0; i < numString.length() / 2; i++) {
           if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
               return false;
                }
           else {
               return true;
                 }
              }
            }

    public static long factorialOf(int num) {
        if (num < 0) {
            return -1;
              }
        
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
             }
        return result;
           }

}