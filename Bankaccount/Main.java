package Bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Elisha Benson", "12345", 500);
        account.printAccountDetails();

        while (account.getBalance() < 1000) {
            account.deposit(50);
        }

        do {
            account.withdraw(100);
        } while (account.getBalance() >= 500);

        account.freezeAccount();
        account.deposit(200);

        account.printAccountDetails();
    }
}
