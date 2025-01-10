import java.util.Calendar;

/**
 * Interface defining the contract for a transaction.
 */
public interface TransactionInterface {
    /**
     * Gets the transaction amount.
     *
     * @return The transaction amount.
     */
    double getAmount();

    /**
     * Gets the transaction date.
     *
     * @return The date of the transaction.
     */
    Calendar getDate();

    /**
     * Gets the unique identifier for the transaction.
     *
     * @return The transaction ID.
     */
    String getTransactionID();

    /**
     * Prints the transaction details to the console.
     */
    void printTransactionDetails();

    /**
     * Applies the transaction to the specified bank account.
     *
     * @param ba The bank account to which the transaction is applied.
     * @throws InsufficientFundsException If the transaction cannot be completed.
     */
    void apply(BankAccount ba) throws InsufficientFundsException;
}
