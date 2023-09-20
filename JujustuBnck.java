package labmanual;

// Bank class, the base class of the hierarchy
class Bank {
    protected String accountNumber;
    protected double balance;

    public Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class, a subclass of Bank
class SavingsAccount extends Bank {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}

// CheckingAccount class, a subclass of Bank
 class CheckingAccount extends Bank {
    private double transactionFee;

    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    public void deductTransactionFee() {
        withdraw(transactionFee);
    }
}

// Main class
public class JujustuBnck {
    public static void main(String[] args) {
        // Create a SavingsAccount object and add interest
        SavingsAccount savings = new SavingsAccount("123456", 1000, 5);
        savings.addInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        // Create a CheckingAccount object and deduct transaction fee
        CheckingAccount checking = new CheckingAccount("654321", 500, 2.5);
        checking.deductTransactionFee();
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}

