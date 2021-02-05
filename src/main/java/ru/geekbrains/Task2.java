package ru.geekbrains;

public class Task2 {
    public boolean checkArrayHasOnly1Or4 (int[] arr){
        if(arr.length == 0) {
            return false;
        }
        for (int a : arr) {
            if (a != 1 && a != 4) {
                return false;
            }
        }
        return true;
    }
}
