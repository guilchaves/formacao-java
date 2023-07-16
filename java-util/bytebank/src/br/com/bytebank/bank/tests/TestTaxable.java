package br.com.bytebank.bank.tests;


import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.LifeInsurance;
import br.com.bytebank.bank.model.TaxCalculator;

public class TestTaxable {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(222, 333);
        ca.deposit(100.0);

        LifeInsurance insurance = new LifeInsurance();

        TaxCalculator calc = new TaxCalculator();
        calc.register(ca);
        calc.register(insurance);

        System.out.println(calc.getTaxTotal());

    }
}
