package com.example.serializeAndDeserialize;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (var fileOutputStream = new FileOutputStream("dog")) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
