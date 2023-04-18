package com.example.RepeatedLoops;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you wanna guess: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("You have entered "+str+" and the re verse is ");
        for (int i = ch.length; i > 0; --i){
            System.out.print(ch[i-1]);
        }
    }
}
