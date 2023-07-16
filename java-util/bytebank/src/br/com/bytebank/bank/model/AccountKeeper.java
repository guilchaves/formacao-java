package br.com.bytebank.bank.model;

public class AccountKeeper {
    private Account[] references;
    private int availableIndexPosition;

    public AccountKeeper(){
        this.references = new Account[10];
        this.availableIndexPosition = 0;
    }

    public void add(Account ref){
        this.references[this.availableIndexPosition] = ref;
        this.availableIndexPosition++;
    }


    public int getElementNumber() {
       return this.availableIndexPosition;
    }

    public Account getRef(int index) {
        return this.references[index];
    }
}
