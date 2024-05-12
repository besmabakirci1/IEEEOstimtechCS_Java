package week4;
import java.io.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q01 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("bufferedWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("hello");
            bufferedWriter.newLine();
            bufferedWriter.write("world!");

        }catch (Exception e) {
            System.out.println(e);
        }

    }

}
