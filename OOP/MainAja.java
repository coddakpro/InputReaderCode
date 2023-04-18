package com.example.OOP;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

 class Ajaaaa {

     public void display(){
        System.out.println("I am dog. ");
    }
    private void makeSound(){
        System.out.println("Bark Bark");
    }
}

public class MainAja {
    public static void main(String[] args) {
        try{
//            create an object of aja
          Ajaaaa aja = new Ajaaaa();

//          create an object of class
//            using getClass()
            Class<? extends Ajaaaa> obj = aja.getClass();

//            using object of class to
//            get all the declared methods of Aja
            Method[] methods = obj.getDeclaredMethods();

//          create an object of the method class
             for (Method m : methods){

//    get names of methods
                 System.out.println("Method Name: " + m.getName());

//                 get the access modifier of methods
                 int modifier = m.getModifiers();
                 System.out.println("Modifiers: " + Modifier.toString(modifier));

//                 get the return type of method
                 System.out.println("Return Types: " + m.getReturnType());
                 System.out.println(" ");
}
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
