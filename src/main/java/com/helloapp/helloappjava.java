package com.helloapp;

public class helloappjava {
    public static void main(String[] args) {
        // If args array is empty, default to "World", otherwise join all elements
        String result = (args.length == 0) ? "World" : String.join(", ", args);

        // Print the final formatted greeting
        System.out.println("Hello, " + result + "!");
    }
}


