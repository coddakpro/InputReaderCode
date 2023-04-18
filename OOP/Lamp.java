package com.example.OOP;

public class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void turnoff(){
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
