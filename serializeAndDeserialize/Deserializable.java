package com.example.serializeAndDeserialize;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {
    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\User\\Admin\\IdeaProjects\\InputReader\\src\\com.example.inputreader"))) {
            var dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException | SecurityException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
