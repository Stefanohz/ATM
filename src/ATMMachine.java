public interface ATMMachine {
    void logIn(int bankCard, int pinNumber);
    void logOut();
    void readBankCard();
    void printReceipt();
    void dispenseCash(int amount);
    void acceptCashOrCheck(int amount);
    void calculateFunds();
}
