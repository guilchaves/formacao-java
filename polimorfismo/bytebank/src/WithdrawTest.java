public class WithdrawTest {

    public static void main(String[] args) {
        Account a = new CheckingAccount(123, 321);

        a.deposit(200.0);

        try{
            a.withdraw(300.0);
        } catch(InsufficientFundsException ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println(a.getBalance());
    }
}
