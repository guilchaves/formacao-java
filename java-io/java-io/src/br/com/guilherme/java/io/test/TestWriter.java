package br.com.guilherme.java.io.test;


import java.io.*;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("ultima linha adicionada");
        bw.close();
        }

    }

