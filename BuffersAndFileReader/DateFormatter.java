package com.example.BuffersAndFileReader;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
                    public static void main(String[] args) {
                        Date date = new Date();
                        SimpleDateFormat formatter;

                        formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
                        String stringDate = formatter.format(date);
                        System.out.println("Date Format and time, : "+stringDate);
                    }

                }

