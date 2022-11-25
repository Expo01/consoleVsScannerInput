package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(ageUsingConsole());
        } catch (NullPointerException e) {
            System.out.println(ageUsingScanner());
        }
        // try and catch keywords relate to exception. allows the program to run, but still not
        // using that method for console it seems.
    }


    public static int ageUsingConsole() {
        String yearOfBirth = System.console().readLine("what is your year of birth?");
        // .readline takes place of sout "text".
        // System.console takes places of scanner.nextLine
        int birthYear = Integer.parseInt(yearOfBirth);
        int age = 2022 - birthYear;
        return age;

        // src/Main.java --> enter key in terminal is NOT working for me...
    }

    public static int ageUsingScanner() {
        Scanner infoScanner = new Scanner(System.in);

        System.out.println("what is your year of birth?");
        String yearOfBirth = infoScanner.nextLine();
        int birthYear = Integer.parseInt(yearOfBirth);
        int age = 2022 - birthYear;
        return age;

    }
}
