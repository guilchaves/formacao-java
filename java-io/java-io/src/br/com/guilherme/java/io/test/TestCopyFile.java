package br.com.guilherme.java.io.test;

import java.io.*;
import java.net.Socket;

public class TestCopyFile {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

//        InputStream fis = System.in;
//        InputStream fis = new FileInputStream("lorem.txt");
        InputStream fis = s.getInputStream();
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

//        OutputStream fos = new FileOutputStream("loremCopy.txt");
//        OutputStream fos = System.out;
        OutputStream fos = s.getOutputStream();
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while(line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
