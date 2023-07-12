package br.com.bytebank;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

public class TestLib {

    public static void main(String[] args) {
        Account a = new CheckingAccount(123, 321);
        System.out.println(a);
    }
}
