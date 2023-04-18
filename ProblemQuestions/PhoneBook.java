package com.example.ProblemQuestions;


import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        String format = """
                press 1 for Phonebook
                press 2 for Messages
                press 3 for Chat
                press 4 for Call register
                press 5 for Tones
                press 6 for Settings
                press 7 for Call divert
                press 8 for Games
                press 9 for Calculator
                press 10 for Reminders
                press 11 for Clock
                press 12 for Profiles
                press 13 for Sim services
                press 0 to exit
                """;
        System.out.println(format);
        System.out.println("Enter any of the numbers above to proceed");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {

        case 1:
        String phonebook = """
                        press 1 to search
                        press 2 for service nos
                        press 3 to add name
                        press 4 to erase
                        press 5 to edit
                        press 6 to assign tone
                        press 7 to send b'card
                        press 8 for options
                        press 9 for speed dials
                        press 10 for voice tags
                                """;
        System.out.println(phonebook);
        System.out.println("Select any of the numbers above to proceed");
        int book = input.nextInt();

        switch (book) {
        case 1:
        System.out.println("You are using the search box");
        break;
        case 2:
        System.out.println("You are in for service nos");
        break;
        case 3:
        System.out.println("You can add name now");
        break;
        case 4:
        System.out.println("You can erase now");
        break;
        case 5:
        System.out.println("Edit");
        break;
        case 6:
        System.out.println("Assign tone");
        break;
        case 7:
        System.out.println("Send b'card");
        case 8:
        String options = """
                                Enter 1 for type of view
                                Enter 2 for message validity
                                """;
        System.out.println("options");
        System.out.println("enter any of the number above to proceed");
        int opt = input.nextInt();

        switch (opt) {
        case 1 -> System.out.println("You are in the type of view");
        case 2 -> System.out.println("You want to check your memory status");
default -> System.out.println("You have to enter one");
        }
        case 9:
        System.out.println("Speed dials selected");
        break;
        case 10:
        System.out.println("Voice tag selected");
        }
        break;
        case 2:
        String message = """
                        press 1 to write message
                        press 2 to check inbox
                        press 3 to check outbox
                        press 4 for picture messages
                        press 5 for templates
                        press 6 for smileys
                        press 7 for message settings
                        press 8 for info service
                        press 9 to check voice mail number
                        press 10 to check service command editor
                                """;
        System.out.println(message);
        System.out.println("Select any of the numbers above to proceed");
        int messages = input.nextInt();

        switch (messages) {
        case 1:
        System.out.println("Now u can write your texts messages");
        break;
        case 2:
        System.out.println("You have a message");
        break;
        case 3:
        System.out.println("No message in outbox");
        case 4:
        System.out.println("Picture message");
        case 5:
        System.out.println("Templates are not available right now");
        case 6:
        System.out.println("LOL smileys only available");
        case 7:
        String setting = """
                                Enter 1 for Set 1
                                Enter 2 for Common
                                """;
        System.out.println(setting);
        System.out.println("Enter 1 of the number above");
        int sett = input.nextInt();
        switch (sett) {
        case 1:
        String settt = """
                                        Enter 1 for Message Centre Number
                                        Enter 2 for Message sent as
                                        Enter 3 for Message validity
                                        """;
        System.out.println(settt);
        System.out.println("Enter 1 of the above");
        int setvv = input.nextInt();
        switch (setvv) {
        case 1:
        System.out.println("This is the message centre number");
        break;
        case 2:
        System.out.println("Your message was sent as");
        break;
        case 3:
        System.out.println("Message validity is ok");
default:
        System.out.println("Enter 1 of the key biko");
        }
        case 2:
        String settv = """
                                        Enter 1 to check delivery report
                                        Enter 2 to reply via same centre
                                        Enter 3 for character support
                                        """;
        System.out.println(settv);
        System.out.println("Enter 1 of the above");
        int settvv = input.nextInt();
        switch (settvv) {
        case 1:
        System.out.println("Message delivered");
        break;
        case 2:
        System.out.println("Replied via same centre");
        break;
        case 3:
        System.out.println("Check character support");
        break;
default:
        System.out.println("Enter 1 of the key biko");
        }
        break;
        case 3:
        System.out.println("Begin chatting with your loved ones");



        }
        }
        }
        }
        }



