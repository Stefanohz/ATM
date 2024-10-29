public class ATMTest {
    public static void main(String[] args) {
        // Simulation user an id
        HumanUser user = new HumanUser(1, 123456, 1234, 5000, 3000);

        // ATm Implementation
        ATMMachine atm = new ATMInterface();

        // Log in test
        System.out.println("== Log in ==");
        atm.logIn(user.getBankCard(), user.getPinNumber());

        // Test cash withdraw
        System.out.println("\n== Withdraw test ==");
        int retiro = 500;
        user.withdrawFunds(retiro);
        atm.dispenseCash(retiro);

        // test the deposit in cash
        System.out.println("\n== Deposit test ==");
        int deposit = 1000;
        user.depositFunds(deposit);
        atm.acceptCashOrCheck(deposit);

        // Verify balance
        System.out.println("\n== Balance ==");
        user.balance();

        // Print receipt
        System.out.println("\n== Print Receipt ==");
        atm.printReceipt();

        // Log out
        System.out.println("\n== Log out ==");
        atm.logOut();
    }
}
