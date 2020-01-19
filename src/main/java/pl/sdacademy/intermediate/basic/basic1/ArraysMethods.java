package pl.sdacademy.intermediate.basic.basic1;

public class ArraysMethods {

public static void arraysBackwards(int [] array){
    for(int i = array.length - 1; i>=0; i--) {
        System.out.println(array[i] + " ");
    }
}


private static void printNumberFromArray(int[]array){

}

private static void printEvenIndexElemntSum(int [] array){
    int sum= 0;
    for(int i =0; i<array.length; i++){
        if(i%2 == 0) {
            sum+=array[i];
        }
    }
    System.out.println(sum);
}

private static void printSumOfElementGreaterThanTen( int[] array){
    int sum =0;
    for(int i = 0; i<array.length; i++){
        if (array[i]>10){

        }
    }
}




}
