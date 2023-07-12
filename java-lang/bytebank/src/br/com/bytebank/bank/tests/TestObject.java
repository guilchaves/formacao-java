package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestObject {
    public static void main(String[] args) {
//        System.out.println("x");
//        System.out.println(2);
//        System.out.println(false);


        CheckingAccount ca = new CheckingAccount(22, 33);
        SavingsAccount sa = new SavingsAccount(44, 55);

        System.out.println(ca.toString());
        System.out.println(sa.toString());
    }

    static void println(){}
    static void println(int a){}
    static void println(boolean b){}
}
