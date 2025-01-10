import java.util.Calendar;

/**
 * Represents a deposit transaction.
 */
public class DepositTransaction extends BaseTransaction {

    /**
     * Constructor for DepositTransaction.
     *
     * @param amount       The deposit amount.
     * @param date         The transaction date.
     * @param transactionID A unique identifier for the transaction.
     */
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    /**
     * Applies a deposit transaction to the specified bank account.
     *
     * @param ba The bank account to which the deposit is applied.
     */
    @Override
    public void apply(BankAccount ba) {
        ba.deposit(amount);
        System.out.println("DepositTransaction: Deposited " + amount);
    }
}
