import java.util.Calendar;

/**
 * Represents a withdrawal transaction.
 */
public class WithdrawalTransaction extends BaseTransaction {

    /**
     * Constructor for WithdrawalTransaction.
     *
     * @param amount       The withdrawal amount.
     * @param date         The transaction date.
     * @param transactionID A unique identifier for the transaction.
     */
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    /**
     * Applies a withdrawal transaction to the specified bank account.
     *
     * @param ba The bank account to which the withdrawal is applied.
     */
    @Override
    public void apply(BankAccount ba) {
        try {
            ba.withdraw(amount);
            System.out.println("WithdrawalTransaction: Withdrew " + amount);
        } catch (InsufficientFundsException e) {
            System.out.println("WithdrawalTransaction: " + e.getMessage());
        }
    }
}
