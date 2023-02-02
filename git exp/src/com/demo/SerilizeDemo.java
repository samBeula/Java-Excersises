package com.demo;
import java.io.*;
public class SerilizeDemo {
    public static void main(String[] args) {
        try{
            //Creating the object
            Student s1 =new Student(777,"Chris Hemsworth");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("src/com/demo/smplTxt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success....");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

