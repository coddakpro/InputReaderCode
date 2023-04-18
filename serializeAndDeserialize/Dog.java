package com.example.serializeAndDeserialize;

import java.io.Serial;
import java.io.Serializable;

public class Dog implements Serializable {
    @Serial
    private static  final long serialVersionUID = 1363382728489828810L;
    private  String name;
    private int age;

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  String toString(){
        return "Dog{" +
                "name='"+ name + '\'' +
                ", age=" + age +
                '}';
    }
}
