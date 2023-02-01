package com.demo;
import java.io.*;
public class BufferOutputStream{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("C:/Users/USER/JAVA IDE/Arithmetic/src/com/demo/smplTxt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Have a great day";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success....");
    }
}
