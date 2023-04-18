package com.example.ArrayChapter7;

public class AnIntArray {
    public static void main(String[] args) {

int[] array = {10, 20, 30, 40, 50, 60, 56, 75, 23, 36};

        System.out.printf("%n%8d%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
