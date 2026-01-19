package Bankaccount;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private String accountNumber;
    protected String accountStatus;

    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.accountStatus = "Active";
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0 && accountStatus.equals("Active")) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (!accountStatus.equals("Active")) {
            System.out.println("Account is frozen.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > 1000) {
            System.out.println("Withdrawal limit exceeded.");
        } else {
            balance -= amount;

            if (balance < 0) {
                balance -= 10;
                System.out.println("Overdraft fee applied: $10");
            }

            System.out.println("Withdrew: $" + amount);
        }
    }

    public void freezeAccount() {
        accountStatus = "Frozen";
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Status: " + accountStatus);
    }
}