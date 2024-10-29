public class HumanUser {
    private int name;
    public int bankCard;
    public int pinNumber;
    private int checkingAccount;
    private int savingAccount;

    public HumanUser(int name, int bankCard, int pinNumber, int checkingAccount, int savingAccount) {
        this.name = name;
        this.bankCard = bankCard;
        this.pinNumber = pinNumber;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
    }

    // getter methods for the private methods
    public int getBankCard() {
        return bankCard;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void balance() {
        System.out.println("Balance: " + checkingAccount);
        System.out.println("Balance Savings account: " + savingAccount);
    }

    public void withdrawFunds(int amount) {
        if (checkingAccount >= amount) {
            checkingAccount -= amount;
            System.out.println("You have withdraw " + amount + " from the main account.");
        } else {
            System.out.println("Not enough founds.");
        }
    }

    public void depositFunds(int amount) {
        checkingAccount += amount;
        System.out.println("You deposit " + amount + " in the main account.");
    }

    public void transferFunds(int amount, int targetAccount) {
        if (checkingAccount >= amount) {
            checkingAccount -= amount;
            System.out.println("You have transfer " + amount + " to the account " + targetAccount);
        } else {
            System.out.println("Not enough founds to transfer.");
        }
    }
}
