package com.demo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Users/USER/JAVA IDE/Arithmetic/src/com/demo/smplTxt");
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException fe){
            fe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
