import java.util.Arrays;

public class RangeFunction {

public static int [] range(int [] numbers) {

int max = numbers[0];

int min = numbers[0];

for(int i = 0; i < numbers.length; i++){

if(numbers[i] > max){

max = numbers[i];

}else if(numbers[i] < min){

min = numbers[i];

}
}

int[] range = {max - min};

return range;
}

public static void main(String[] args){

   int [] numbers = {7, 4, 2, 3, 4, 9};

   int [] range = RangeFunction.range(numbers);

   System.out.print(Arrays.toString(range));
}

}