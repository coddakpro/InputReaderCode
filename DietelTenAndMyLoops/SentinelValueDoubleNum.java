package DietelTenAndMyLoops;

import java.util.Scanner;

public class SentinelValueDoubleNum {
    public static void main(String[] args) {

        double number = (double)(Math.random() * 657);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0: ");
        int integer = (int) input.nextDouble();


        double sum = 0.0;
        while (integer != number){
            System.out.print("\nEnter an integer (the input ends if it is 0: ");
            integer = (int) input.nextDouble();
            sum+=  integer +  number;
        }
    }
}
