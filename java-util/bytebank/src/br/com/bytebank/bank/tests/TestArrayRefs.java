package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestArrayRefs {
    public static void main(String[] args) {

        Account[] accounts = new Account[5];
        CheckingAccount ca1 = new CheckingAccount(22,11);
        SavingsAccount sa1 = new SavingsAccount(22, 22);

        accounts[0] = ca1;
        accounts[1] = sa1;


        SavingsAccount ref = (SavingsAccount) accounts[1];
        System.out.println(ref.getNumber());
    }
}
