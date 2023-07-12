package br.com.bytebank.bank.model;

public class TaxCalculator {
    private double taxTotal;

    public void register(Taxable t){
        double value = t.getTaxValue();
        this.taxTotal += value;
    }

    public double getTaxTotal(){
        return taxTotal;
    }
}
