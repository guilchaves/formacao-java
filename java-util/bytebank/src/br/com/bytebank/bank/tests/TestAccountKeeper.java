package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.AccountKeeper;
import br.com.bytebank.bank.model.CheckingAccount;

public class TestAccountKeeper {

    public static void main(String[] args) {
        AccountKeeper keeper = new AccountKeeper();

        Account ca = new CheckingAccount(22, 11);
        Account ca2 = new CheckingAccount(22, 33);
        keeper.add(ca);
        keeper.add(ca2);

        int size = keeper.getElementNumber();
        System.out.println(size);

        Account ref = keeper.getRef(0);

    }
}
