import java.util.Calendar;

/**
 * Abstract base class for all types of transactions.
 */
public abstract class BaseTransaction implements TransactionInterface {
    protected double amount;
    protected Calendar date;
    protected String transactionID;

    /**
     * Constructor for a BaseTransaction.
     *
     * Requires:
     * - `amount > 0` (A positive transaction amount)
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

    @Override
    public abstract void apply(BankAccount ba) throws InsufficientFundsException;
}
