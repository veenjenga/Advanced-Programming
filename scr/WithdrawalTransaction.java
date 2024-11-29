import java.util.Calendar;

public class WithdrawalTransaction extends BaseTransaction {

    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) throws InsufficientFundsException { // Matches interface
        if (ba.getBalance() >= amount) {
            ba.withdraw(amount);
            System.out.println("Withdrawal of " + amount + " applied.");
        } else {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
    }

    public boolean reverse(BankAccount ba) {
        ba.deposit(amount);
        System.out.println("Withdrawal reversed. Amount restored: " + amount);
        return true;
    }
}
