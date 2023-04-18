package com.example.RepeatedLoops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the strings : ");
        str = input.nextLine();
        System.out.println("the reverse number is :"+str+" is :");
        int i = str.length();
        while (i > 0) {
            System.out.print(str.charAt(i - 1));
            i--;
        }
    }
}
