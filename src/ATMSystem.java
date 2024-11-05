import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // Test user data
        HumanUser user = new HumanUser(1, 123456, 1234, 5000, 3000);
        ATMMachine atm = new ATMMachineImpl() {
            @Override
            public void readBankCard() {

            }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter Bank Card Number: ");
        int card = scanner.nextInt();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        // Attempt login
        atm.logIn(card, pin);

        boolean exit = false;
        while (!exit && atm instanceof ATMMachineImpl) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Print Receipt");
            System.out.println("5. Log Out");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.balance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    user.withdrawFunds(withdrawAmount);
                    atm.dispenseCash(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    user.depositFunds(depositAmount);
                    atm.acceptCashOrCheck(depositAmount);
                    break;
                case 4:
                    atm.printReceipt();
                    break;
                case 5:
                    atm.logOut();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the ATM!");
    }
}
