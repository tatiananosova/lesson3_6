package ru.geekbrains;

import java.util.Arrays;

public class Task1 {

    public int[] getArrNumbersAfterLast4(int[] arr) {
        boolean valid = false;
        for (int a : arr) {
            if (a == 4) {
                valid = true;
            }
        }
        if (!valid) {
            throw new RuntimeException("Input array doesn't have any 4");
        }
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastIndex = i;
            }
        }
        return Arrays.copyOfRange(arr, lastIndex+1, arr.length);
    }

}
