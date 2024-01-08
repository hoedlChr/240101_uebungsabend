package IBAN_;

import java.util.Arrays;

public class ArrayEinmalEins {
    public static void main(String[] args) {
        int[][] array = new int[3][10];

        for (int i = 0; i < array.length; i++) { //reihen
            int[] ints = array[i];
            for (int j = 0; j < ints.length; j++) {//spalten
               array[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();

        int[][] array2 = calc(10);
        for (int[] ints : array2) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] calc(int length){
        int[][] array = new int[length][10];

        for (int i = 0; i < array.length; i++) { //reihen
            int[] ints = array[i];
            for (int j = 0; j < ints.length; j++) {//spalten
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }
}
