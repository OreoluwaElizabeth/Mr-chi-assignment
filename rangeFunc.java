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

int range = max - min;

return range;


}
}