package arrays;

import java.util.Random;

public class ArrayHelper {
    public static void main(String[] args) {

        int[] array = createIntArray(6,45);
        int counter = 1;
        for (int i : array) {
            System.out.println("Die Glückszahl an der Stelle " + counter + " lautet: " + i);
            counter++;
        }

        System.out.println("validateTipp = " + validateTipp(array));
    }
    public static int[] createIntArray(int sizeOfArray, int maxValue){
        int[] returnValue = new int[sizeOfArray];

        for(int i = 0; i < returnValue.length; i++){
            returnValue[i] = new Random().nextInt(maxValue +1);
        }
        
        return returnValue;
    }

    public static boolean validateTipp(int[] array){
        for(int counter1 = 0; counter1 < array.length; counter1++){
            for(int counter2 = 0; counter2 < array.length; counter2++){
                if (array[counter1] == array[counter2] && counter1 != counter2) {
                    return false;
                }
            }
        }
        return true;
    }
}
