package br.com.bytebank.bank.model;

public class LifeInsurance implements Taxable {
    @Override
    public double getTaxValue(){
        return 42;
    }
}
