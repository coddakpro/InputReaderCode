package com.example.RepeatedLoops;

public class StudentGrade {

    private String name;
    private double average;

//    constructor initializes instance variables
    public StudentGrade(String name, double average){
        this.name = name;

//        validates that average is > 0.0 and 100.0; otherwise,
//        keep instance variable average's default value (0.0)
        if (average > 0.0){
            if (average <= 100){
                this.average = average;   //      assign to instance variable
            }
        }
    }
//    sets the student's name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    set's the student's average
    public void setAverage(double studentAverage) {
//        validates that average is > 0.0 and  <= 100.0; otherwise,
//        keep instance variable average's current value
        if (average > 0.0){
            if (average <= 100){
                this.average = average;     //    assign to instance variable
            }
        }
    }
//    retrieve the student's average
    public double getAverage() {
        return average;
    }
//    determines and return the student letter grade
    public  String getLetterGrade(){
        String letterGrade = "";     //     initializing to empty String

        if (average >= 90.0){
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else  {
            letterGrade = "F";
        }
        return  letterGrade;
    }
}
