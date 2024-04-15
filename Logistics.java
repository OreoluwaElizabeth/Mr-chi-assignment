public class Logistics {

    public static int calculatePayment(int successfulDeliveries) {
         int basePay = 5000;
         int amountPerParcel;

         if (successfulDeliveries < 50) {
            amountPerParcel = 160;
               }
         else if (successfulDeliveries <= 59) {
             amountPerParcel = 200;
                }
         else if (successfulDeliveries <= 69) {
             amountPerParcel = 250;
                 }
         else {
             amountPerParcel = 500;
              }

         int totalPayment = successfulDeliveries * amountPerParcel + basePay;
         return totalPayment;
           }

     public static void main(String [] args) {

         assert calculatePayment(25) == 9000;

         assert calculatePayment(55) == 11000;

         assert calculatePayment(65) == 16250;

         assert calculatePayment(80) == 45000;
          }
         }

