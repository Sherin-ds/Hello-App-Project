package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder namesList = new StringBuilder();

            // Enhanced for-loop (for-each) to iterate through arguments
            for (String name : args) {
                // If StringBuilder is not empty, append a comma and space before the next name
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }

            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}

