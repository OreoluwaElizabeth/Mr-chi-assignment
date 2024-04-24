import java.util.Scanner;

  public class SevenSegmentDisplay {

    public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to 7 - segement display");

     for(int i = 0; i < 10; i++) {

     System.out.print("Enter a number to display: ");
     int number = scanner.nextInt(); 

       switch(number) {

       case 0:
         System.out.println(" _\n| |\n|_|");
         break;

       case 1:
         System.out.println(" \n |\n |");
         break;

       case 2:
         System.out.println(" _\n _|\n|_ ");
         break;

       case 3:
         System.out.println("_\n_|\n_|");
         break;

       case 4:
         System.out.println("|_|\n | ");
         break;

       case 5:
         System.out.println(" _\n|_ \n _|");
         break;

       case 6:
         System.out.println(" _\n|_ \n|_|");
         break;

       case 7:
         System.out.println(" _\n  |\n  |");
         break;

       case 8:
         System.out.println(" _\n|_|\n|_|");
         break;

       case 9:
         System.out.println(" _\n|_|\n _|");
         break;

       }

     }

   }

}