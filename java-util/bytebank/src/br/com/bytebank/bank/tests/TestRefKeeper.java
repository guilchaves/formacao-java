package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.RefKeeper;

public class TestRefKeeper {

    public static void main(String[] args) {

        RefKeeper keeper = new RefKeeper();

        Account cc = new CheckingAccount(22, 11);
        keeper.add(cc);

        Account cc2 = new CheckingAccount(22, 22);
        keeper.add(cc2);

        int size = keeper.getElementNumber();
        System.out.println(size);

        Account ref = (Account) keeper.getRef(1);
        System.out.println(ref.getNumber());

    }
}