/**
 * Represents a bank account.
 */
public class BankAccount {
    private double balance;

    /**
     * Constructor for BankAccount.
     *
     * @param balance The initial balance of the account.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
    }
}
