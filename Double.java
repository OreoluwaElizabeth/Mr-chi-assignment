import java.util.Arrays;

public class Double {

 public static void main(String [] args) {

   int [] numbers = {4, 5, 8};

   length(numbers);
   
   System.out.println(Arrays.toString(length(numbers)));
}


public static int [] length(int [] num) {

   int [] newArray = new int[num.length * 2];

   for (int i = 0; i < num.length; i++) {
      newArray[i] = num[i];
      newArray[i + num.length] = num[i] * 2;
  }

return newArray;
}


}