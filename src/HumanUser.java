import java.io.FileWriter;
import java.io.IOException;

public class HumanUser {
    private int name;
    private int bankCard;
    private int pinNumber;
    private int checkingAccount;
    private int savingAccount;

    // Constructor
    public HumanUser(int name, int bankCard, int pinNumber, int checkingAccount, int savingAccount) {
        this.name = name;
        this.bankCard = bankCard;
        this.pinNumber = pinNumber;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
    }

    // Getters for accessing private attributes
    public int getBankCard() {
        return bankCard;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    // Method to display balance
    public void balance() {
        System.out.println("Checking account balance: $" + checkingAccount);
        System.out.println("Savings account balance: $" + savingAccount);
    }

    // Method to withdraw funds
    public void withdrawFunds(int amount) {
        if (checkingAccount >= amount) {
            checkingAccount -= amount;
            System.out.println("Withdrawn $" + amount + " from checking account.");
            logTransaction("Withdrawal: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to deposit funds
    public void depositFunds(int amount) {
        checkingAccount += amount;
        System.out.println("Deposited $" + amount + " into checking account.");
        logTransaction("Deposit: $" + amount);
    }

    // Helper method to log transactions to a file
    private void logTransaction(String transaction) {
        try (FileWriter writer = new FileWriter("user_data.txt", true)) {
            writer.write(transaction + " | Checking Balance: $" + checkingAccount + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while logging the transaction.");
        }
    }
}
