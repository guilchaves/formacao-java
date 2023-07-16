package br.com.bytebank.bank.tests;

public class TestString {

    public static void main(String[] args) {
        String name = "Guilherme";
        String spacedName = "   Chaves";

        String loweredName = name.toLowerCase();
        String replacedName = name.replace("G", "W");
        char letter = name.charAt(2);
        int pos = name.indexOf("lh");

        System.out.println(loweredName);
        System.out.println(replacedName);
        System.out.println(letter);
        System.out.println(pos);
        System.out.println(name.length());
        System.out.println(spacedName);
        System.out.println(spacedName.trim());
        System.out.println(name.contains("Gui"));

    }
}
