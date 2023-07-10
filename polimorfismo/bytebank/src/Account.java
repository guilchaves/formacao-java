public abstract class Account {
    protected double balance;
    private int agency;
    private int number;
    private Client  holder;
    private static int total = 0;


    public Account(int agency, int number){
        Account.total++;
        System.out.println("The number of total accounts created is: " + Account.total);
        this.agency = agency;
        this.number = number;
        this.balance = 0;
        System.out.println("Creating account " + this.getNumber());
    }

    public abstract void deposit(double value);


    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account destination){
        if(this.withdraw(value)){
            destination.deposit(value);
            return true;
        }

        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if(agency <= 0){
            System.out.println("The agency number must be greater than 0");
        }
        this.agency = agency;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if(number <= 0){
            System.out.println("The account number must be greater than 0");
        }
        this.number = number;
    }

    public Client getHolder() {
        return this.holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getTotal(){
        return Account.total;
    }
}
