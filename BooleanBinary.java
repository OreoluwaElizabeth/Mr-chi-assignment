import java.util.Arrays;

public class BooleanBinary {

  public static void main(String [] args) {

  int [] numbers = {4, 5, 8, 8, 8, 2, 9};

  boolean[] booleanResults = binary(numbers);

  System.out.print(Arrays.toString(booleanResults));


}

public static boolean [] binary(int [] num) {

boolean [] booleanArray = new boolean[num.length];

for (int i = 0; i < num.length; i++) {

 booleanArray[i] = num[i] % 2 == 1;

}

return booleanArray;

}


}