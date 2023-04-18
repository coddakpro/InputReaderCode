package com.example.RepeatedLoops;

import Chapter4.StudentGrade;

public class StudentTest {
    public static void main(String[] args) {

        StudentGrade account1 = new StudentGrade("Jane Green", 93.5);
        StudentGrade account2 = new StudentGrade("Jide Bolu", 72.75);

        System.out.printf("%s's letter grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade3 is: %s%n",
                account2.getName(), account2.getLetterGrade());
    }
}
