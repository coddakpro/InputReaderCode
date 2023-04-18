package com.example.RepeatAndGuessingCode;

import java.util.Scanner;
public class GuessingNumber {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 1 to 100");

        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}

