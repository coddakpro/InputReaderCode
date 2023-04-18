package com.example.serializeAndDeserialize;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;

public class Cat {
    private String name;
    private int age;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonProperty("birthday")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm:")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDateTime dateOfBirth;

    public Cat(String name, int age, LocalDateTime dateOfBirth) {
      this.name = name;
      this.age = age;
      this. dateOfBirth = dateOfBirth;
    }

    public Cat() {

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

    public void setDateOfBirth(LocalDateTime minusYears) {
    }

    public TemporalAccessor getDateOfBirth() {

        return null;
    }
}
