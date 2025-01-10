import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Calendar now = Calendar.getInstance();

        // BaseTransaction instance
        BaseTransaction baseTransaction = new BaseTransaction(0, now, "T001");
        baseTransaction.apply(account); // Default behavior

        // DepositTransaction instance
        BaseTransaction deposit = new DepositTransaction(500, now, "T002");
        deposit.apply(account);
        System.out.println("Balance after deposit: " + account.getBalance());

        // WithdrawalTransaction instance
        BaseTransaction withdrawal = new WithdrawalTransaction(300, now, "T003");
        try {
            withdrawal.apply(account);
            withdrawal.printTransactionDetails();
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Reversing the withdrawal
        withdrawal.reverse(account);
        System.out.println("Balance after reversal: " + account.getBalance());
    }
}
