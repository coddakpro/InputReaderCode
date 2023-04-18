package com.example.RepeatedLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       String str;
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
       str = input.nextLine();
        System.out.println("the revert String: "+str+ " is :");
        int i = str.length();
        while (i > 0){
            System.out.print(str.charAt(i-1));
            i--;
        }

       }
    }

