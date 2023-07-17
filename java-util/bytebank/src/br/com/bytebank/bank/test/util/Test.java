package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        //generics
        ArrayList<Account> list = new ArrayList<Account>();

        Account cc = new CheckingAccount(22, 11);
        Account cc2 = new CheckingAccount(22, 22);

        list.add(cc);
        list.add(cc2);

        //System.out.println(list.size());
        Account ref = (Account) list.get(0);

        list.remove(0);

        Account cc3 = new CheckingAccount(33,311);
        list.add(cc3);
        Account cc4 = new CheckingAccount(33, 322);
        list.add(cc4);

//        for(int i = 0; i < list.size(); i++){
//            Object oRef = list.get(i);
//            System.out.println(oRef);
//        }

        for(Object o :  list){
            System.out.println(o);
        }

    }

}
