package com.example.RepeatedLoops;

import java.util.Scanner;
public class StringReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guessed word: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Your  reversed word is: "+str+" is: ");
        for (int i = ch.length; i > 0; --i){
            System.out.print(ch[i - 1]);
        }
    }
}
