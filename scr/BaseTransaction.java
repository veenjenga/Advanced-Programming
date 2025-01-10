import java.util.Calendar;

/**
 * Represents the base class for all transaction types.
 * Implements default behavior for the apply method.
 */
public class BaseTransaction implements TransactionInterface {
    protected double amount;
    protected Calendar date;
    protected String transactionID;

    /**
     * Constructor for BaseTransaction.
     *
     * Requires:
     * - `amount > 0` (Transaction amount must be positive).
     * - `transactionID` is non-null and unique.
     *
     * Produces:
     * - Initializes a transaction with the specified details.
     *
     * @param amount       The transaction amount.
     * @param date         The transaction date.
     * @param transactionID A unique identifier for the transaction.
     */
    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return date;
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Date: " + date.getTime());
        System.out.println("Amount: " + amount);
    }

    /**
     * Default implementation of apply().
     * Does nothing by default and must be overridden in subclasses.
     *
     * @param ba The bank account to which the transaction is applied.
     */
    @Override
    public void apply(BankAccount ba) {
        System.out.println("Base transaction applied with no specific behavior.");
    }
}
