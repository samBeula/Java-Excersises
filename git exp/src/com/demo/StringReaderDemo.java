package com.demo;

import java.io.StringReader;

public class StringReaderDemo {
    public static void main(String[] args) {

        String data = "This is the text read from StringReader.";

        // Create a character array
        char[] c = new char[data.length()];

        try {
            StringReader input = new StringReader(data);
            input.read(c);
            System.out.println("Data read from the string:");
            System.out.println(c);
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}