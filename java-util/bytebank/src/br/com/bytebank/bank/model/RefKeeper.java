package br.com.bytebank.bank.model;

public class RefKeeper {

    private Object[] references;
    private int availableIndexPosition;

    public RefKeeper() {
        this.references = new Object[10];
        this.availableIndexPosition = 0;
    }

    public void add (Object ref) {
        this.references[this.availableIndexPosition] = ref;
        this.availableIndexPosition++;
    }

    public int getElementNumber() {
        return this.availableIndexPosition;
    }

    public Object getRef(int index) {
        return this.references[index];        }
}