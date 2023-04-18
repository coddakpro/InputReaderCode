package com.example.OOP;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Doggy {
    public String type;
}
class DoggyMain {
    public static void main(String[] args) {
        try{

            Doggy d1 = new Doggy();

            Class<? extends Doggy> obj = d1.getClass();

            Field field1 = obj.getField("type");
            field1.set(d1, "labrador");

            String typeValue =(String) field1.get(d1);
            System.out.println("value: " +  typeValue);

            int mod = field1.getModifiers();

            String modifier1 = Modifier.toString(mod);
            System.out.println("Modifier: " + modifier1);
            System.out.println(" ");
        }
        catch (NoSuchFieldException | IllegalAccessException e) {
       e.printStackTrace();
        }
    }
}
