public abstract class ATMMachineImpl implements ATMMachine {
    private boolean isLoggedIn = false;

    @Override
    public void logIn(int bankCard, int pinNumber) {
        // Simulate login (in real implementation, validate with stored credentials)
        if (bankCard == 123456 && pinNumber == 1234) {  // Replace with actual check if needed
            isLoggedIn = true;
            System.out.println("Login successful.");
        } else {
            System.out.println("Incorrect card or PIN.");
        }
    }

    @Override
    public void logOut() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Logged out.");
        } else {
            System.out.println("No user is logged in.");
        }
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt...");
    }

    @Override
    public void dispenseCash(int amount) {
        if (isLoggedIn) {
            System.out.println("Dispensing $" + amount + " in cash.");
        } else {
            System.out.println("You must log in before dispensing cash.");
        }
    }

    @Override
    public void acceptCashOrCheck(int amount) {
        if (isLoggedIn) {
            System.out.println("Accepting deposit of $" + amount + ".");
        } else {
            System.out.println("You must log in before making a deposit.");
        }
    }

    @Override
    public void calculateFunds() {
        System.out.println("Calculating funds...");
    }
}
