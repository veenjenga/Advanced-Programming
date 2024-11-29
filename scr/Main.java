import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Create Transactions
        Calendar now = Calendar.getInstance();
        DepositTransaction deposit = new DepositTransaction(500, now, "D123");
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(300, now, "W123");

        // Test Deposit
        deposit.apply(account);
        deposit.printTransactionDetails();
        System.out.println("Balance after deposit: " + account.getBalance());

        // Test Withdrawal
        try {
            withdrawal.apply(account);
            withdrawal.printTransactionDetails();
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Test Reverse Withdrawal
        withdrawal.reverse(account);
        System.out.println("Balance after reversal: " + account.getBalance());
    }
}
