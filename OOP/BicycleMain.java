package com.example.OOP;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle sportBike = new Bicycle();
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnoff();
        sportBike.getGear();
        sportBike.getBarking();
    }
}
