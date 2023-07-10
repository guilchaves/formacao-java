public class TestAccount {

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(111, 111);
        ca.deposit(100.0);

        SavingsAccount sa = new SavingsAccount(222, 222);
        sa.deposit(200.0);

        ca.transfer(10.0, sa);

        System.out.println("CA balance: " + ca.getBalance());
        System.out.println("SA balance: "+ sa.getBalance());
    }
}
