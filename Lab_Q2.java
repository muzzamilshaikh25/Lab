/*Q.2 Create an abstract class called "BankAccount" with attributes such as account number and balance, and abstract methods called "deposit" and "withdraw".
 *  Create a subclass called "CheckingAccount" that inherits from BankAccount and implements the "deposit" and "withdraw" methods. 
 *  Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods
 */
package IPA;
abstract class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars.");
    }
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " dollars.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

public class Lab_Q2 {
	public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }

}