package com.example.RepeatedLoops;

import java.util.Scanner;

public class MoreWays {
    public static void main(String[] args) {
         int number1 = (int)(Math.random() * 89);

         Scanner input = new Scanner(System.in);
        System.out.println("Enter your Guess number to win! ");

        while (true) {
            System.out.print("\nWhat's your guess: ");
          int guess = input.nextInt();
          int lessThan = 0;
          lessThan = guess % number1;

          if (guess == number1)
              System.out.println("Yes, the number is " + number1);
          if (guess < number1)
              System.out.println("The number is " + lessThan + " less than Predict");
           if (guess > number1)
               System.out.println("The number is " + lessThan + " GreaterThan Predict");
           else if (guess != number1) {
               System.out.println("OTI LOOR! ");

           }
        }
    }
}
