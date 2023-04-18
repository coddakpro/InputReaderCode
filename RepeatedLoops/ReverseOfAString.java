package com.example.RepeatedLoops;

import java.util.Scanner;

public class ReverseOfAString {
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        str=input.nextLine();
        System.out.println("Reverse of string '"+str+"' is :");
        for (int j = str.length(); j > 0; j--) {
            System.out.print(str.charAt(j - 1));
        }
        }

}
