package com.demo;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:/Users/USER/JAVA IDE/Arithmetic/src/com/demo/smplTxt1");
            fw.write("this is writing smth into a file");
            fw.close();

        } catch(Exception e){
            e.getMessage();
        }
        System.out.println("success...");
    }
}