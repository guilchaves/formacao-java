package br.com.bytebank.bank.model;

public class CheckingAccount extends Account implements Taxable {
   public CheckingAccount(int agency, int number){
       super(agency, number);
   }

    @Override
    public void deposit(double value) {
       super.balance += value;

    }

    @Override
    public void withdraw(double value) {
        double taxedValue = value + 0.2;
        super.withdraw(taxedValue);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
