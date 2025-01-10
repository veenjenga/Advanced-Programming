import java.util.Calendar;

/**
 * Represents a deposit transaction.
 */
public class DepositTransaction extends BaseTransaction {

    /**
     * Constructor for a DepositTransaction.
     *
     * Requires:
     * - `amount > 0` (A positive deposit amount)
     *
     * Produces:
     * - Initializes a deposit transaction with the specified details.
     *
     * @param amount       The deposit amount.
     * @param date         The transaction date.
     * @param transactionID A unique identifier for the transaction.
     */
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) {
        ba.deposit(amount);
        System.out.println("Deposit of " + amount + " applied.");
    }
}
