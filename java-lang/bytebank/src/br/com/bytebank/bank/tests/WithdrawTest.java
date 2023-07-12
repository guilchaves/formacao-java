package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientFundsException;

public class WithdrawTest {

    public static void main(String[] args) {
        Account a = new CheckingAccount(123, 321);

        a.deposit(200.0);

        try{
            a.withdraw(100.0);
        } catch(InsufficientFundsException ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println(a.getBalance());
    }
}
