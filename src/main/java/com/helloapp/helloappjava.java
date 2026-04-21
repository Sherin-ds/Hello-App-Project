package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Step 1: Append every name followed by a delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 2: Clean up the trailing delimiter (", ")
            // We take a substring from index 0 to (length - 2)
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}


