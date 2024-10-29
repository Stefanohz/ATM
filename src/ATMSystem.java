public class ATMSystem {
    public static void main(String[] args) {
        // Create the instances HumanUser, ATMMachine, y BankBranch
        HumanUser user = new HumanUser(1, 123456, 1234, 1000, 2000);
        ATMMachine atm = new ATMInterface();
        BankBranch branch = new BankBranch(1, 1000, 2000);

        // Simulation
        atm.logIn(user.bankCard, user.pinNumber);
        user.withdrawFunds(100);
        atm.dispenseCash(100);
        atm.printReceipt();
        atm.logOut();
    }
}
