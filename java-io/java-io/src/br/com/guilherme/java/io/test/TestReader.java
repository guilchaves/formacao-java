package br.com.guilherme.java.io.test;

import java.io.*;

public class TestReader {
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }


        br.close();
    }
}
