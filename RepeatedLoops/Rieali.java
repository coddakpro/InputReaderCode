package com.example.RepeatedLoops;

import java.util.Scanner;

public class Rieali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the words you Love: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Moyinoluwa you have entered  \n" + str + "\nand the reverse is: ");
        for (int i = ch.length;  i > 0; --i){
            System.out.print(ch[i-1]);
        }
    }
}
