package com.example.OOP;

public class Bicycle {

    private int gear = 5;

    public void getBarking() {
        System.out.println("working of Barking");
    }

    public void getGear() {
        while (gear != 0 ){
            gear++;
            if (gear > 1) {
                gear++;
            }
            if (gear > 2) {
                gear++;
            }
        }


    }
}
