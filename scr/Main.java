import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Calendar now = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(500, now, "D123");
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(300, now, "W123");

        deposit.apply(account);
        deposit.printTransactionDetails();
        System.out.println("Balance after deposit: " + account.getBalance());

        try {
            withdrawal.apply(account);
            withdrawal.printTransactionDetails();
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        withdrawal.reverse(account);
        System.out.println("Balance after reversal: " + account.getBalance());
    }
}
