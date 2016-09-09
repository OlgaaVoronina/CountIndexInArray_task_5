package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IsIndex isI = new IsIndex();
        int value = 5;
        boolean isValue = false;
        int[] arr = {1, 5, 8, 5, 8, 5, 4, 7, 5};

        System.out.println(Arrays.toString(arr));
        System.out.println("Value = " + value);

        isI.Indexes(isI.HowMuch(isI.isValueInArray(value, arr),arr, value), value, arr);


    }




}
