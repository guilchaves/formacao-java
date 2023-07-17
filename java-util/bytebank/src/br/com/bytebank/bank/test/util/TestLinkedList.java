package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        //generics
        List<Account> list = new LinkedList<Account>();

        Account cc = new CheckingAccount(22, 11);
        Account cc2 = new CheckingAccount(22, 22);

        list.add(cc);
        list.add(cc2);

        System.out.println(list.size());
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
