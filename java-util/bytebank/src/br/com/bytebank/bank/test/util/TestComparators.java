package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;


public class Test {
    public static void main(String[] args) {
        Account cc1 = new CheckingAccount(22, 33);
        Client clientCC1 = new Client();
        clientCC1.setName("Rodrigo");
        cc1.setHolder(clientCC1);
        cc1.deposit(333.0);

        Account cc2 = new SavingsAccount(22, 44);
        Client clientCC2 = new Client();
        clientCC2.setName("Guilherme");
        cc2.setHolder(clientCC2);
        cc2.deposit(444.00);

        Account cc3 = new CheckingAccount(22, 11);
        Client clientCC3 = new Client();
        clientCC3.setName("Iris");
        cc3.setHolder(clientCC3);
        cc3.deposit(111.0);

        Account cc4 = new SavingsAccount(22, 22);
        Client clientCC4 = new Client() ;
        clientCC4.setName("Helena");
        cc4.setHolder(clientCC4);
        cc4.deposit(222.00);

        List<Account> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        for(Account account : list){
            System.out.println(account + ", " + account.getHolder().getName());
        }

        AccountNumberComparator comparator = new AccountNumberComparator();
        AccountHolderComparator holderComparator = new AccountHolderComparator();

        //list.sort(comparator);
        list.sort(holderComparator);
        System.out.println("===========================================");
        for(Account account : list){
            System.out.println(account + ", " + account.getHolder().getName());
        }
    }
}


class AccountHolderComparator implements Comparator<Account>{

    @Override
    public int compare(Account a1, Account a2) {

        String holderA1 = a1.getHolder().getName();
        String holderA2 = a2.getHolder().getName();

        return holderA1.compareTo(holderA2);
    }
}
class AccountNumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
        if(a1.getNumber() < a2.getNumber()){
            return -1;
        }

        if(a1.getNumber() > a2.getNumber()){
            return 1;
        }
        return 0;
    }
}