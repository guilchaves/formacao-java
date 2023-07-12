public class WithdrawTest {

    public static void main(String[] args) {
        Account a = new CheckingAccount(123, 321);

        a.deposit(200.0);
        a.withdraw(100.0);
        System.out.println(a.getBalance());
    }
}
