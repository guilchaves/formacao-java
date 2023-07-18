package br.com.guilherme.java.io.test;

import java.io.*;

public class TestSerializationClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Client client = new Client();
//        client.setName("Guilherme");
//        client.setOccupation("Software Engineer");
//        client.setCpf("12345678910");

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("client.bin"));
//        oos.writeObject(client);
//        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.bin"));
        Client client = (Client) ois.readObject();
        ois.close();
        System.out.println(client.getCpf());

    }
}
