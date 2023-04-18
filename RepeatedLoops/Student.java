import java.util.Scanner;

public class Student {


    private String name;
    private double average;

    public Student(String name, double average)
    {
        Scanner Scan = new Scanner(System.in);
        this.name=name;
        if (average > 0.0)
           if (average <= 100.0)
               this.average = average;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName ()
    {
        return name;
    }
    public String getLetterGrade()
    {
        String letterGrade = "";
        if(average >= 90.0)
            letterGrade ="A";
        System.out.println("you passed");

        else if (average >= 80.0)
            letterGrade = "B";
        System.out.println("you can do better");

        else if (average >= 70.0)
            letterGrade = "C";
        System.out.println("you try small");

        else if (average >= 60.0)
            letterGrade = "D";
        System.out.println("you no dey try");

        else
            letterGrade = "F";
        System.out.println("oya come dey go abeg");
        return letterGrade;
    }
}

