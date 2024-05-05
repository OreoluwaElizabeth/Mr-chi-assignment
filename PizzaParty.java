import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {

    int [] slices = {4, 6, 8, 12};

    String [] types = {"Sapa size", "Small Money", "Big boys", "Odogwu"};

    int [] prices = {2000, 2400, 3000, 4200};

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Number of People: ");
    int noOfPeople = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Enter Pizza Type: ");
    String pizzaType = scanner.nextLine();


    int slicePerBox = 0;
    String pizzaTypeChoice = "";
    int pricePerBox = 0;

    for (int i = 0; i < types.length; i++) {
        if (pizzaType.equalsIgnoreCase(types[i])) {
            slicePerBox = slices[i];
            pizzaTypeChoice = types[i];
            pricePerBox = prices[i];

          }

     }

   if (slicePerBox == 0) {
       System.out.println("Sorry, we couldn't find the pizza type");
    }

  int numOfBoxes = (int) Math.round ((double) noOfPeople / slicePerBox);
      
  int leftoverSlices = noOfPeople % slicePerBox;

  int totalPrice = numOfBoxes * pricePerBox;

      System.out.println("For " + noOfPeople + " people, you will need " + numOfBoxes + " boxes");
      System.out.println("There will be " + leftoverSlices + " slice left");
      System.out.println("The total price is: " + totalPrice);




}



}