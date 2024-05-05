import java.util.Scanner;

public class Pizza{

    public static void main(String[] args) {

       int pizza1Slices = 4;
       String pizza1Type = "Sapa size";
       int pizza1Price = 2000;

       int pizza2Slices = 6;
       String pizza2Type = "Small Money";
       int pizza2Price = 2400;

       int pizza3Slices = 8;
       String pizza3Type = "Big boys";
       int pizza3Price = 3000;

       int pizza4Slices = 12;
       String pizza4Type = "Odogwu";
       int pizza4Price = 4200;
       

       Scanner scanner = new Scanner(System.in);

       System.out.print("How many people are attending the party? ");
       int numberOfPeople = scanner.nextInt();

       scanner.nextLine();

       System.out.print("What kind of pizza would you like to order? ");
       String pizzaChoice = scanner.nextLine();

       int slicePerBox = 0;
       String pizzaTypeChoice = "";
       int pricePerBox = 0;

       if (pizzaChoice.equalsIgnoreCase("Sapa size")) {
           slicePerBox =  pizza1Slices;
           pizzaTypeChoice = pizza1Type;
           pricePerBox = pizza1Price;
        }
 
      else if (pizzaChoice.equalsIgnoreCase("Small Money")) {
           slicePerBox =  pizza2Slices;
           pizzaTypeChoice = pizza2Type;
           pricePerBox = pizza2Price;
        }

      else if (pizzaChoice.equalsIgnoreCase("Big boys")) {
           slicePerBox =  pizza3Slices;
           pizzaTypeChoice = pizza3Type;
           pricePerBox = pizza3Price;    
        }
      else if (pizzaChoice.equalsIgnoreCase("Odogwu")) {
           slicePerBox =  pizza4Slices;
           pizzaTypeChoice = pizza4Type;
           pricePerBox = pizza4Price;
        }
      else {
         System.out.println("Sorry, we couldn't find the pizza type");
        }

      int numOfBoxes = (int) Math.round ((double) numberOfPeople / slicePerBox);
      
      int leftoverSlices = numberOfPeople % slicePerBox;

      int totalCost = numOfBoxes * pricePerBox;

      System.out.println("For " + numberOfPeople + " people, you will need " + numOfBoxes + " boxes");
      System.out.println("There will be " + leftoverSlices + " slice left");
      System.out.println("The total cost will be: " + totalCost);


    }

}






