package ua.epam;

import java.util.Arrays;

/**
 * Created by Olga_Voronina on 9/9/2016.
 */
public class IsIndex {

    //method 1
    public static boolean isValueInArray(int value, int[] arr) {
        boolean isLocalValue = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                isLocalValue = true;
            }
        }
        if (!isLocalValue) {
            System.out.println("\nNot this value in array");
        }
        return isLocalValue;
    }

    //method 2
    public static int HowMuch(boolean isLocalValue, int[] arr, int value) {
        int count = 0;
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value)
                    count++;
            }
            System.out.println("Count = " + count);
        }
        return count;
    }

    //method 3
    public static int IfOne(int count) {
        if (count == 1) {
            System.out.println("Only 1 value");
        } else {
            System.out.println("Value is " + count + " times");
        }
        return count;
    }

    //method 4
    public static int[] Indexes(int count, int value, int[] arr){
        int[] arrIndexes = new int [count];
        for (int i = 0, countOfIndex = 0; i < arr.length; i++){ //int i = 0, countOfIndex = 0; - java feature
            if (value == arr[i]){
                arrIndexes[countOfIndex] = i;
                countOfIndex++;
            }
        }
            System.out.println("\nIndexes " + Arrays.toString(arrIndexes));
        return arrIndexes;
    }


}
