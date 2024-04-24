import java.util.Arrays;

public class EvenAndBinary {

  public static void main(String [] args) {

  int [] numbers = {4, 5, 8, 8, 8, 2, 9};

  binary(numbers);

  System.out.print(Arrays.toString(binary(numbers)));


}

public static int [] binary(int [] num) {

for (int i = 0; i < num.length; i++) {

if (num[i] % 2 == 0) {

num[i] = 0;

}

else {

num[i] = 1;

}


}

return num;

}


}