package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

import java.util.ArrayList;

public class TestArrayListEquals {

    public static void main(String[] args) {

        //generics
        ArrayList<Account> list = new ArrayList<Account>();

        Account cc = new CheckingAccount(22, 11);
        Account cc2 = new CheckingAccount(22, 22);
        Account cc3 = new CheckingAccount(22, 22);

        list.add(cc);
        list.add(cc2);

        boolean exists = list.contains(cc3);

        System.out.println("Does this element exists? " + exists);

        for(Account account : list){
            if(account == cc3){
                System.out.println("This reference is on the list already");
            }
        }

        for(Account account :  list){
            System.out.println(account);
        }

//        Account cc1 = new CheckingAccount(22, 22);
//        Account cc2 = new CheckingAccount(22, 22);
//
//        boolean same = cc1.isEqual(cc2);
//        System.out.println(same);

    }

}
