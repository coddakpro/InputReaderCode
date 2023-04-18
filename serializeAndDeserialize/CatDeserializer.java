package com.example.serializeAndDeserialize;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static String deserializeJsonToCat(String Json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return String.valueOf(objectMapper.readValue(Json.getBytes(), Cat.class));
        } catch (IOException e) {
            System.err.println(e.getMessage());
           return e.getMessage();
        }
    }
}
