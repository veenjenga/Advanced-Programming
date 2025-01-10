import java.util.Calendar;

/**
 * Represents a withdrawal transaction.
 */
public class WithdrawalTransaction extends BaseTransaction {

    /**
     * Constructor for a WithdrawalTransaction.
     *
     * Requires:
     * - `amount > 0` (A positive withdrawal amount)
     *
     * Produces:
     * - Initializes a withdrawal transaction with the specified details.
     *
     * @param amount       The withdrawal amount.
     * @param date         The transaction date.
     * @param transactionID A unique identifier for the transaction.
     */
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) throws InsufficientFundsException {
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
