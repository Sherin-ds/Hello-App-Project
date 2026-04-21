package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        String finalNames;

        if (args.length > 0) {
            // Using String.join to combine all array elements with a comma and space
            finalNames = String.join(", ", args);
        } else {
            // Fallback if no arguments are provided
            finalNames = "World";
        }

        // Output the concatenated greeting
        System.out.println("Hello, " + finalNames + "!");
    }
}
