package com.example.BuffersAndFileReader;

import com.example.BuffersAndFileReader.AppUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String[] words = {"Qwery", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};

            try{
                OutputStreamWriter writer =
                        new OutputStreamWriter(new FileOutputStream(AppUtils.APP_ASSET_LOCATION+"\\output.txt"));
                BufferedWriter bufferedWriter  = new BufferedWriter(writer);
            bufferedWriter.write(words[0]+" "+words[3]);
            bufferedWriter.flush();
            bufferedWriter.write(words[1]);
            bufferedWriter.close();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
    }

