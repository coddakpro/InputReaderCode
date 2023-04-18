package com.example.RepeatedLoops;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
//        create scanner input to input from command window
        Scanner input = new Scanner(System.in);

//        initialization phase
          int total = 0; //        initialize sum of grades entered by the user
         int gradeCounter = 1;  //     initialize # of grade to be entered next

//        processing phase uses counter-controlled iteration

        while (gradeCounter <= 10) { //     loop 10 times
          gradeCounter = gradeCounter + 1;   //        increment counter by 1
            System.out.print("Enter Grades: "); //    prompt
            int grade = input.nextInt();  //        input next grade
            total = total + grade;    //       add grade to total
        }

//        termination phase
         int average = total / 10; //        integer division yields integer result

//        displays total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

    }
}
