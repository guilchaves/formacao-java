package br.com.guilherme.java.io.test;


import java.io.*;

public class TestWriter2 {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw =  new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("ultima linha adicionada atualizada");
        bw.newLine();
        bw.write("assinado: eu");
        bw.close();
        }
    }

