package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        // Ternary operator: condition ? valueIfTrue : valueIfFalse
        // Checks if an argument exists; if not, defaults to "World"
        String name = (args.length > 0) ? args[0] : "World";

        // Display the personalized greeting using String Concatenation
        System.out.println("Hello, " + name + "!");
    }
}

