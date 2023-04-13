/*Q.3 Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods.
 *  Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
 */

package IPA;

interface BankAccount1 {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount1 implements BankAccount1 {
    private int accountNumber;
    private double balance;

    public CheckingAccount1(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class Lab_Q3 {
	public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }

}
