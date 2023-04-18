package com.example.BuffersAndFileReader;

import com.example.BuffersAndFileReader.AppUtils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderException {
    public static void main(String[] args) {
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter(AppUtils.APP_ASSET_LOCATION+"\\test.txt")
        ){
            String input = bufferedReader.readLine();
            writer.write(input);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
