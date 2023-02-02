package com.demo;

import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) {

        String data = "This is the text in the string.";

        try {
            StringWriter output = new StringWriter();
            output.write(data);
            System.out.println("Data in the StringWriter: \n" + output);
            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
