public class ATMInterface implements ATMMachine {
    private int bankAccount;
    private int bankBranch;
    private boolean isLoggedIn = false;

    @Override
    public void logIn(int bankCard, int pinNumber) {
        // Simulating log in session
        if (bankCard == 123456 && pinNumber == 1234) {  //Credentials Simulation
            isLoggedIn = true;
            System.out.println("Logged in.");
        } else {
            System.out.println("Wrong PIN or card.");
        }
    }

    @Override
    public void logOut() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Closing session.");
        } else {
            System.out.println("User not logged in .");
        }
    }

    @Override
    public void readBankCard() {
        System.out.println("Reading the card...");
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt...");
    }

    @Override
    public void dispenseCash(int amount) {
        if (isLoggedIn) {
            System.out.println("Dispensing " + amount + " in cash.");
        } else {
            System.out.println("You need to log in before dispensing the money.");
        }
    }

    @Override
    public void acceptCashOrCheck(int amount) {
        if (isLoggedIn) {
            System.out.println("Accept " + amount + " as a deposit.");
        } else {
            System.out.println("You need to log in before accepting a deposit.");
        }
    }

    @Override
    public void calculateFunds() {
        System.out.println("Calculating founds...");
    }
}
