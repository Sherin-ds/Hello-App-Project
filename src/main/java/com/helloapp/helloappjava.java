package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        // Check if at least one argument is provided to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // Access the first argument using index 0
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback to default if no argument is passed
            System.out.println("Hello, World!");
        }
    }
}
